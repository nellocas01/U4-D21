package com.example.u4d21;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.u4d21.exceptions.ErrorsPayload;
import com.example.u4d21.exceptions.UnsupportedLanguageException;

@RestControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UnsupportedLanguageException.class)
	public ResponseEntity<ErrorsPayload> handleUnsupportedLanguageException(UnsupportedLanguageException ex) {
		System.out.println(ex);
		ErrorsPayload payload = new ErrorsPayload("LA LINGUA USATA E DIVERSA DA QUELLA INGLESE E ITALIANA", new Date(),
				500);
		return new ResponseEntity<ErrorsPayload>(payload, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}