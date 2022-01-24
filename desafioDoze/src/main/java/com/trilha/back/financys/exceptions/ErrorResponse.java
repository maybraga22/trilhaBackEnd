package com.trilha.back.financys.exceptions;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {

	private final String message;

}
