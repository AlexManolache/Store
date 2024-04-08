package com.alexm.stores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class StoresApplication {

	public static void main(String[] args) {
		
		Dotenv dotenv = Dotenv.configure().load();
      		   
        String databaseUrl = dotenv.get("SPRING_DATASOURCE_URL");

        System.setProperty("spring.datasource.url", databaseUrl);

        
		SpringApplication.run(StoresApplication.class, args);
	}

}
