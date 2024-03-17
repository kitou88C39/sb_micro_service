package com.example.school;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

}
