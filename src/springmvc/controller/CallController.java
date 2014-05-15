package springmvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import springmvc.model.Response;

@Controller
public class CallController {
	private static final Logger logger = LoggerFactory.getLogger(CallController.class);

	@RequestMapping(value="/call", method={RequestMethod.GET}, produces="application/json")
	public ResponseEntity<Response> get(HttpServletResponse resp) {
		logger.info("call-get");
		Response response = new Response("call-get");
		return new ResponseEntity<Response>(
			response, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/call", method={RequestMethod.POST}, produces="application/json")
	public ResponseEntity<Response> post(HttpServletResponse resp) {
		logger.info("call-post");
		Response response = new Response("call-post");
		return new ResponseEntity<Response>(
			response, new HttpHeaders(), HttpStatus.OK);
	}
}
