package com.kodilla.homework.enums;

public enum Version {

    S("Wersja S"),
    M("Wersja M"),
    L("Wersja L"),
    LE("Limited Edition");

    private final String version;

    Version(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return version;
    }
}
