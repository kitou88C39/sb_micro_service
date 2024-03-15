package com.example.school;

import lombok.*;

@Entity
@Getter
@setter
@AllArgesConstructor
@NoArgesConstructor
@Builder
public class Student {

    private Integer firstname;
    private String lastname;
    private String email;

}
