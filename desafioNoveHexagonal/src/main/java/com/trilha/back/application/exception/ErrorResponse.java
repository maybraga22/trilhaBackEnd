package com.trilha.back.application.exception;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Builder
public class ErrorResponse {

	private final String message;

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static class DivisionZeroException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public DivisionZeroException(String exception) {
            super(exception);
        }
    }
}
