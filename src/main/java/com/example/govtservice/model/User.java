package com.example.govtservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class User {
    private String userId;
    private String name;
    private int age;
    private String sex;
    private String country;
    private LocalDate createdDate;
}
