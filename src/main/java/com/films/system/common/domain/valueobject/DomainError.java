package com.films.system.common.domain.valueobject;

public class DomainError extends RuntimeException {

    public DomainError(String message) {
        super(message);
    }
}
