package com.service.hotel.Controller;


import com.service.hotel.DTO.HotelDTO;
import com.service.hotel.DTO.HotelRequestDTO;
import com.service.hotel.DTO.UserDTO;
import com.service.hotel.DTO.UserRequestDTO;
import com.service.hotel.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getOne(id));
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<UserDTO> createHotel(@RequestBody UserRequestDTO request) throws BadRequestException {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(request));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserRequestDTO request) {
        return ResponseEntity.ok(userService.update(id, request));
    }
}

