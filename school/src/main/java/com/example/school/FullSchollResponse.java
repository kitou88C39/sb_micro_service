package com.example.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class FullSchollResponse {

    private String name;

    private String email;

    List<Student> students;

}
