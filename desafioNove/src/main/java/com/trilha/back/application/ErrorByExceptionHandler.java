package com.trilha.back.application;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.trilha.back.domain.DivisionZeroException;

@ControllerAdvice
public class ErrorByExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DivisionZeroException.class)
	public final ResponseEntity<?> divisionByZero(DivisionZeroException exception) {

		ErrorResponse error = new ErrorResponse(exception.getMessage());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
