package com.supplierregistry.supplierregistry.rest.exception;

import com.supplierregistry.supplierregistry.rest.model.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BaseResponse> handleBadRequestException(BadRequestException ex) {
        return new ResponseEntity<>(new BaseResponse(false, ex.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
