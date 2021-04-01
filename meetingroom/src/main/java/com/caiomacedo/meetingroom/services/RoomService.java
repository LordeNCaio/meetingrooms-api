package com.caiomacedo.meetingroom.services;

import com.caiomacedo.meetingroom.dto.RoomPostDTO;
import com.caiomacedo.meetingroom.entities.Room;
import com.caiomacedo.meetingroom.exceptions.room.RoomNotFoundException;
import com.caiomacedo.meetingroom.repositories.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public Room findById(Long id) {
        return roomRepository.findById(id).orElseThrow(() -> new RoomNotFoundException(id.toString()));
    }

    public void createRoom(RoomPostDTO dto) {
        roomRepository.save(dto.toRoom());
    }

    public void updateRoom(Long id, RoomPostDTO dto) {
        var room = findById(id);
        room = dto.toRoom();
        room.setId(id);

        roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        var room = findById(id);
        roomRepository.delete(room);
    }
}
