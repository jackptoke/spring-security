package dev.toke.springsecurity.config;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.jwk.RSAKey.Builder;
import com.nimbusds.jose.proc.SecurityContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.SecurityFilterChain;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPublicKey;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.springframework.security.config.Customizer.withDefaults;


@Slf4j
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class JwtSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        log.info("securityFilterChain ..." );

        http
                .authorizeHttpRequests((authorize) -> authorize
                                .requestMatchers("/contacts", "/notices", "/home", "/authenticate", "login/**").permitAll()
                                .requestMatchers("/admin", "/admin/**", "/files").hasAnyAuthority("ROLE_ADMIN")
                                .anyRequest().authenticated()
                )
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .httpBasic(withDefaults())
                .csrf(AbstractHttpConfigurer::disable)
                .headers(headers-> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin))
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(withDefaults()));
        return http.build();

    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtDecoder jwtDecoder(RSAKey rsaKey) {
        try {
            return NimbusJwtDecoder
                    .withPublicKey(rsaKey.toRSAPublicKey())
                    .build();
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Bean
    public KeyPair KeyPair()  {
        try {
            var keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Bean
    public RSAKey rsaKey(KeyPair keyPair) {
        return new Builder((RSAPublicKey)keyPair.getPublic())
                .privateKey(keyPair.getPrivate())
                .keyID(UUID.randomUUID().toString())
                .build();

    }

    @Bean
    public JWKSource<SecurityContext> jwkSource(RSAKey rsaKey) {
        var jwkSet = new JWKSet(rsaKey);
        return (jwkSelector, securityContext) -> jwkSelector.select(jwkSet);
    }

    @Bean
    public JwtEncoder jwtEncoder(JWKSource<SecurityContext> jwkSource) {
        return new NimbusJwtEncoder(jwkSource);
    }




}
