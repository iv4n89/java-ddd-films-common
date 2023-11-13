package com.films.system.common.domain;

import java.util.UUID;

public class UuidGenerator {
    public String randomString() {
        return UUID.randomUUID().toString();
    }

    public UUID randomUUID() {
        return UUID.randomUUID();
    }

    public UUID from(String value) {
        return UUID.fromString(value);
    }
}
