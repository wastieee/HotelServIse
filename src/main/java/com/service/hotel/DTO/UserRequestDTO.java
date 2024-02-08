package com.service.hotel.DTO;

import com.service.hotel.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
    private String password;
    private String login;
    private String firstName;
    private String lastName;
    private Integer age;
    private Role role;
    private Integer numberOfGuests;
}
