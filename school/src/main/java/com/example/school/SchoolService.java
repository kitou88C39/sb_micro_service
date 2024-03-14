package com.alibou.school;

import lombok.RequiredArgsConstrucutor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstrucutor
public class SchoolService {

    private final SchoolRepository repository;

    public void saveStudent(School school) {
        repository.save(school);

    }

    public List<School> findAllSchools(){
        return repository.findAll()
    }

}
