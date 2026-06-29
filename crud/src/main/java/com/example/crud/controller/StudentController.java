package com.example.crud.controller;

import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService StudentService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Student Controller";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return StudentService.getAllStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return StudentService.addStudent(student);
    }

    @GetMapping("/students/{rno}")
    public Student getStudent(@PathVariable("rno") int rno) {
        return StudentService.getStudent(rno);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return StudentService.updateStudent(student);
    }

    @DeleteMapping("/students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno) {
        StudentService.deleteStudent(rno);
        return "Deleted student with id " + rno;
    }
}
