package br.dev.ferreiras.pantry_provisioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PantryProvisioningApplication {

	public static void main(String[] args) {
		SpringApplication.run(PantryProvisioningApplication.class, args);
	}

}
