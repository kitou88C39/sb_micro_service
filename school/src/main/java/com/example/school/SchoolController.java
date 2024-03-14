package com.alibou.school;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStaus.CREATED)
    public void save(
            @RequestBody School school) {

        service.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(service.findAllSchools());
    }

    @GetMapping{"/with-students/{school-id}"}

    public ResponseEntity<List<School>> findAllSchools(
        ＠PathVariable("school-id")Integer schoolId
    ){
        return ResponseEntity.ok(service.findschoolsWithStudents(schoolId));
    }

}
