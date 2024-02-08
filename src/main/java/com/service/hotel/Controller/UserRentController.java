package com.service.hotel.Controller;

import com.service.hotel.DTO.UserRentRequestDTO;
import com.service.hotel.Service.UserRentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserRentController {

    private final UserRentService userRentService;

    @PostMapping("/hotel/{roomId}/rent")
    ResponseEntity<Void> apply(@PathVariable Long roomId, @RequestBody UserRentRequestDTO request) {
        // FIXME: возвращать айди аренды
        userRentService.apply(roomId, request);
        return ResponseEntity.ok().build();
    }

}
