package com.error.spring.springerrorhandling.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/student")
    public ResponseEntity<Student> getStudent(){
        throw new ArrayIndexOutOfBoundsException();
    }

}
