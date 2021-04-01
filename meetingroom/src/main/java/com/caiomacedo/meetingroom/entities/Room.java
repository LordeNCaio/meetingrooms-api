package com.caiomacedo.meetingroom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "rooms")
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "start_hour")
    private LocalDateTime startHour;

    @Column(name = "end_hour")
    private LocalDateTime endHour;

    public Room(String name, LocalDate date, LocalDateTime startHour, LocalDateTime endHour) {
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }
}
