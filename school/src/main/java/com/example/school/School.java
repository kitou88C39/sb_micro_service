package com.alibou.school;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@setter
@AllArgesConstructor
@NoArgesConstructor
@Builder
public class School {

    @Id
    private Integer id;
    private String name;
    private String email;

}