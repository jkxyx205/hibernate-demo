package com.rick.quickstart.controller;

import com.rick.quickstart.dao.StudentRepository;
import com.rick.quickstart.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by rick on 5/5/18.
 */
@RestController("/students")
public class StudentController {

    @Resource
    private StudentRepository studentRepository;

    @PostMapping
    public String save(@Valid @RequestBody Student student, Errors errors) {
        if (errors.hasErrors()) {
            return errors.getFieldErrors().toString();
        }

        studentRepository.save(student);
        return "success";
    }
}
