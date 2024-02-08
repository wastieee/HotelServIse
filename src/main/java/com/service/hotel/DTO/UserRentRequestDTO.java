package com.service.hotel.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRentRequestDTO {
    private Long userId;
    private LocalDate start;
    private LocalDate finish;
}
