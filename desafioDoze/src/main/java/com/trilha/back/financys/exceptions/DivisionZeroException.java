package com.trilha.back.financys.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisionZeroException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DivisionZeroException(String exception) {
		super(exception);
	}
}