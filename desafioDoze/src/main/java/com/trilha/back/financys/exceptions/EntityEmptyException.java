package com.trilha.back.financys.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EntityEmptyException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public EntityEmptyException (String message){
		super(message);		
	}

}
