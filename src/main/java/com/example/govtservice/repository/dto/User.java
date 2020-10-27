package com.example.govtservice.repository.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@Document(collection = "userdata")
public class User {
    @Id
    private String userId;
    private String name;
    private int age;
    private String sex;
    private String country;
    private LocalDate createdDate;
}
