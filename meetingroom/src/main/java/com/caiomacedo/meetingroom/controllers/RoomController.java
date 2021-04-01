package com.caiomacedo.meetingroom.controllers;

import com.caiomacedo.meetingroom.dto.RoomPostDTO;
import com.caiomacedo.meetingroom.entities.Room;
import com.caiomacedo.meetingroom.services.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/rooms")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Room> findAllRooms() {
        return roomService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Room findRoomById(@PathVariable Long id) {
        return roomService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createRoom(@Valid @RequestBody RoomPostDTO dto) {
        roomService.createRoom(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateRoom(@PathVariable Long id, @RequestBody RoomPostDTO dto) {
        roomService.updateRoom(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteRoom(@PathVariable Long id){
        roomService.deleteRoom(id);
    }
}
