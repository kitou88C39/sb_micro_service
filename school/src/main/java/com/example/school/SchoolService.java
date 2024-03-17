package com.alibou.school;

import lombok.RequiredArgsConstrucutor;
import org.springframework.stereotype.Service;

import com.alibou.school.School;

@Service
@RequiredArgsConstrucutor
public class SchoolService {

    private final SchoolRepository repository;

    public void saveStudent(School school) {
        repository.save(school);

    }

    public List<School> findAllSchools() {
        return repository.findAll();

    }

    public FullschoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = repository.findAllById(schoolId)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build());
        var students = null;// find all the students from the student micro service
        return null;

    }
}
