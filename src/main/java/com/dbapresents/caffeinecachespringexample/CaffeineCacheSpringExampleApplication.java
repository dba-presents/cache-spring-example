package com.dbapresents.caffeinecachespringexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CaffeineCacheSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaffeineCacheSpringExampleApplication.class, args);
	}

}
