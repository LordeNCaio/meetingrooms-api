package com.caiomacedo.meetingroom.exceptions.handler;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorMessage {

    private final String message;
    private final String details;
    private final LocalDateTime timestamp;

    public ErrorMessage(String message, String details) {
        this.message = message;
        this.details = details;
        timestamp = LocalDateTime.now();
    }
}
