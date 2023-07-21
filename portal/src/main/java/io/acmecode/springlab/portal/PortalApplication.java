package io.acmecode.springlab.portal;

import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortalApplication {

	private static Logger logger = LoggerFactory.getLogger(PortalApplication.class);

	public static void main(String[] args) {
		
		Timer timer = new Timer("Timer");
		
		long delay = 1000L;
		timer.schedule(new HeartbeatTask(), delay, 5000L);

		logger.info("Starting Portal");
		SpringApplication.run(PortalApplication.class, args);
	}

}
