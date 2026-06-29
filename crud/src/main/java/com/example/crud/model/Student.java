package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private int id;
    private String Name;
    private String gender;
    private int technology;
}
