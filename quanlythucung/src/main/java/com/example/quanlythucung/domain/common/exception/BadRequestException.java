package com.example.quanlythucung.domain.common.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}