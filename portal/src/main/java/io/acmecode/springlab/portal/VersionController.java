package io.acmecode.springlab.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	Logger logger = LoggerFactory.getLogger(VersionController.class);

	@GetMapping("/version")
	public String index() {
		logger.info("Version triggered");
		return "{\"version\": \"1.0\"}";
	}

}