package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import springmvc.model.Response;
import springmvc.model.Request;

@Controller
public class CallController {
	private static final Logger logger = LoggerFactory.getLogger(CallController.class);

	@RequestMapping(value="/call", method={RequestMethod.GET},
		produces="application/json")
	public ResponseEntity<Response> get(HttpServletRequest req) {
		logger.info("call-get");
		Response response = new Response("call-get");
		return new ResponseEntity<Response>(
			response, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/call", method={RequestMethod.POST},
		consumes="application/json", produces="application/json")
	public ResponseEntity<Response> post(@RequestBody Request req) {
		logger.info("call-post {}", req.getInput());
		Response response = new Response(req.getInput());
		return new ResponseEntity<Response>(
			response, new HttpHeaders(), HttpStatus.OK);
	}
}
