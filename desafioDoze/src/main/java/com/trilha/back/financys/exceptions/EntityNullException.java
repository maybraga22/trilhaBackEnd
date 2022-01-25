package com.trilha.back.financys.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EntityNullException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public EntityNullException (String message){
		super(message);		
	}

}
