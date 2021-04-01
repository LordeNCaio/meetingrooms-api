package com.caiomacedo.meetingroom.exceptions.room;

import java.util.function.Supplier;

public class RoomNotFoundException extends RuntimeException{

    public RoomNotFoundException(String message){
        super(message);
    }

}
