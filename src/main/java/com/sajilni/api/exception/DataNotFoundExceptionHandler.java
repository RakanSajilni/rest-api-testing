package com.sajilni.api.exception;


import com.sajilni.api.entites.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DataNotFoundExceptionHandler  {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorMessage> messageNotFound(DataNotFoundException e) {
        ErrorMessage errorMessage =
                new ErrorMessage(e.getMessage(), HttpStatus.BAD_REQUEST, "make sure to choose a correct message");
        return new ResponseEntity<>(errorMessage,errorMessage.getStatusCode());
    }
}
