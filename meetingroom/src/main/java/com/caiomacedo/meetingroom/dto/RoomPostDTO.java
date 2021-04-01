package com.caiomacedo.meetingroom.dto;

import com.caiomacedo.meetingroom.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomPostDTO {

    private String name;
    private LocalDate date;
    private String startHour;
    private String endHour;

    public Room toRoom(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        var formattedStartDate = LocalDateTime.parse(getStartHour(), formatter);
        var formattedEndDate = LocalDateTime.parse(getEndHour(), formatter);
        return new Room(getName(), getDate(), formattedStartDate, formattedEndDate);
    }
}
