package com.example.client;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

}
