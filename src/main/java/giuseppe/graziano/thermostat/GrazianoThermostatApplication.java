package giuseppe.graziano.thermostat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class GrazianoThermostatApplication {


	public static void main(String[] args) {

		SpringApplication.run(GrazianoThermostatApplication.class, args);
	}

}

