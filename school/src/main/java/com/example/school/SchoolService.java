package com.alibou.school;

import lombok.RequiredArgsConstrucutor;
import org.springframework.stereotype.Service;

import com.alibou.school.School;
import com.example.client.StudentClient;

@Service
@RequiredArgsConstrucutor
public class SchoolService {

    private final SchoolRepository repository;

    private StudentClient client

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
        var students = client.findAllStudentsBySchool(schoolId);
        return FullSchollResponse.builder()

    }
}
