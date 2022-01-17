package com.trilha.back.financys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntryNotFoundException  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public EntryNotFoundException(String message) {
		super(message);
	}

}
