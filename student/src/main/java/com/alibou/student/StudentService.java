package com.alibou.student;

import lombok.RequiredArgsConstrucutor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstrucutor
public class StudentService {

    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);

    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Integer schookId) {
        return null;
    }
}
