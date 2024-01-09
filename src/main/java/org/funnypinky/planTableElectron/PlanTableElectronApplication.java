package org.funnypinky.planTableElectron;

import jakarta.annotation.PostConstruct;
import org.funnypinky.planTableElectron.Service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanTableElectronApplication {

	@Autowired
	private EntityService entityService;

	public static void main(String[] args) {
		SpringApplication.run(PlanTableElectronApplication.class, args);
	}
}
