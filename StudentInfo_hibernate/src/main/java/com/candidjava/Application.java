package com.candidjava;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class )
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
