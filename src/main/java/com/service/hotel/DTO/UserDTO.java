package com.service.hotel.DTO;

import com.service.hotel.Entity.Role;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String password;
    private String login;
    private String firstName;
    private String lastName;
    private Integer age;
    private Role role;
    private Integer numberOfGuests;
}
