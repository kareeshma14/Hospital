package com.comprehensive.assessment.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class doctorServiceExceptionHandler {
	@ExceptionHandler(value = {doctorServiceException.class})
    public ResponseEntity<Object> handlerDoctorServiceException(doctorServiceException ex, WebRequest request){
        return new ResponseEntity<>(ex.getMessage(),new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY);

    }
}
