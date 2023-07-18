package io.acmecode.springlab.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);

	@GetMapping("/")
	public String index() {
        logger.info("Index triggered");
		return "<html><head><title>AcmeCode :: Home</title></head><body><h1>AcmeCode Portal (redployed again)</h1></body></html>";
	}

}