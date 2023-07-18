package io.acmecode.springlab.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	@GetMapping("/version")
	public String index() {
		return "{\"version\": \"1.0\"}";
	}

}