package com.error.spring.springerrorhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//console output when no specific handler
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HelloException extends RuntimeException{
public HelloException(String message){
    super(message);
}
}

