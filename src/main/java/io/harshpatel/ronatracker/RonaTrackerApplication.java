package io.harshpatel.ronatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RonaTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RonaTrackerApplication.class, args);
	}

}
