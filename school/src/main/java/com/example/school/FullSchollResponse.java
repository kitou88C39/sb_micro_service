package com.example.school;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter

public class FullSchollResponse {

    private String name;
    private String email;
    List<Student> students;

}
