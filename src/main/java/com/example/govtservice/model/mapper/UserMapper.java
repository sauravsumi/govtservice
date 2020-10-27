package com.example.govtservice.model.mapper;


import com.example.govtservice.repository.dto.User;

import java.time.LocalDate;
import java.util.Optional;

public class UserMapper {
    public static User map(com.example.govtservice.model.User user) {
        return User.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .age(user.getAge())
                .sex(user.getSex())
                .country(user.getCountry())
                .createdDate(LocalDate.now()).build();
    }
    public static com.example.govtservice.model.User map(User user) {
        return com.example.govtservice.model.User.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .age(user.getAge())
                .sex(user.getSex())
                .country(user.getCountry())
                .createdDate(user.getCreatedDate()).build();
    }
}
