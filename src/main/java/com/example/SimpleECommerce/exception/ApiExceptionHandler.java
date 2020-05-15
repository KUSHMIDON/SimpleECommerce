package com.example.SimpleECommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @SuppressWarnings("rawtypes")
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ApiError> handle(ConstraintViolationException e) {
        ApiError errors = new ApiError();
        for (ConstraintViolation violation : e.getConstraintViolations()) {
            errors.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            errors.setMessage(violation.getMessage());
        }
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @SuppressWarnings("rawtypes")
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handle(ResourceNotFoundException e) {
        ApiError error = new ApiError();
        error.setMessage(e.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}