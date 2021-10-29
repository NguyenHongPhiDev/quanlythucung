package com.example.quanlythucung.domain.common.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
