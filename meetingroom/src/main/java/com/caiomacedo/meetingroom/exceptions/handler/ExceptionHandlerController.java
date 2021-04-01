package com.caiomacedo.meetingroom.exceptions.handler;

import com.caiomacedo.meetingroom.exceptions.room.RoomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(RoomNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage roomNotFoundException(RoomNotFoundException ex) {
        return new ErrorMessage(
                "The given room was not found",
                "The room "+ex.getMessage()+" not exists"
        );
    }
}
