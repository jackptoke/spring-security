package dev.toke.springsecurity.models;

public enum Role {
    ADMIN("admin"),
    USER("user");

    public final String label;
    private Role(String label) {
        this.label = label;
    }
}
