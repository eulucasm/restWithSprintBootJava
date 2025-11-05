package br.com.eulucasm.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {

}
