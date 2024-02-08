package com.service.hotel.DTO.Converter;

import com.service.hotel.DTO.UserDTO;
import com.service.hotel.Entity.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class User2DTOConverter implements Converter<User, UserDTO>  {
    @Override
    public UserDTO convert(User source) {
        return UserDTO.builder().id(source.getId()).login(source.getLogin())
                .age(source.getAge())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .numberOfGuests(source.getNumberOfGuests())
                .role(source.getRole())
                .password(source.getPassword()).build();
    }
}
