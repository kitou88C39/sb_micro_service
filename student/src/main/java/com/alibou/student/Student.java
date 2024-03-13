package com.alibou.student;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@setter
@AllArgesConstructor
@NoArgesConstructor
@Builder
public class Student {

    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
