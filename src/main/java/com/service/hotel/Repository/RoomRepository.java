package com.service.hotel.Repository;

import com.service.hotel.Entity.Hotel;
import com.service.hotel.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
