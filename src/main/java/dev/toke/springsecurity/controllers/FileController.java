package dev.toke.springsecurity.controllers;

import com.mentor.harness.schema.bridgesharness.HarnessDataType;
import com.mentor.harness.schema.bridgesharness.Harnessdesign;
import com.mentor.harness.schema.bridgesharness.WiringDesignType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/files")
@Slf4j
public class FileController {
    @PostMapping("/xml")
    public ResponseEntity<Object> uploadXML(@RequestParam("file") MultipartFile file) {
        String filename = file.getOriginalFilename().isBlank() ? "" : file.getOriginalFilename();
        String ext = filename.substring(filename.lastIndexOf("."));
        log.info("File type: " + ext);
        if(!ext.equalsIgnoreCase(".XML")) return ResponseEntity.badRequest().body("Accept only XML file");

        JAXBContext jaxbContext = null;

        try {
            jaxbContext = JAXBContext.newInstance(Harnessdesign.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Harnessdesign harnessdesign = (Harnessdesign) jaxbUnmarshaller.unmarshal(file.getInputStream());

            harnessdesign.getSourceOrOptionsetOrModulecodeset().forEach(obj -> {
                if(obj instanceof HarnessDataType) log.info("Harness found");
                else if(obj instanceof WiringDesignType) log.info("Wiring connectivity found");
            });

            return ResponseEntity.ok("File received: " + harnessdesign.getAuthor());
        }catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.badRequest().body("Unacceptable file type.");
    }
}
