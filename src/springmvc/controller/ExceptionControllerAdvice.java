package springmvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import springmvc.model.Response;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> exception(Exception e) {

		Response response = new Response(e.toString());
		return new ResponseEntity<Response>(
			response, new HttpHeaders(), HttpStatus.OK);
	}
}
