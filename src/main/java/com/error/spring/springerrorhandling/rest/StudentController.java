package com.error.spring.springerrorhandling.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/student")
    public ResponseEntity<Student> getStudent(){
        //throw new StudentNotFoundException("Cannot find exception");
    //returning the appropriate codes
        return ResponseEntity.notFound().build();
    }
/*@ResponseStatus(HttpStatus.NOT_FOUND)
@ExceptionHandler({StudentNotFoundException.class})
public ResponseEntity<Student> handleHelloException() {

}*/
}
