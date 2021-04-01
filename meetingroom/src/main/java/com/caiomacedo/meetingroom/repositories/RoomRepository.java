package com.caiomacedo.meetingroom.repositories;

import com.caiomacedo.meetingroom.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
