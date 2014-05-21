package springmvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import springmvc.model.Response;

@Controller
public class ErrorController {
	private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

	@RequestMapping(value="/missing", produces="application/json")
	public ResponseEntity<Response> missing(HttpServletResponse resp) {
		logger.info("missing");
		Response response = new Response("missing");
		return new ResponseEntity<Response>(
			response, new HttpHeaders(), HttpStatus.OK);
	}
}
