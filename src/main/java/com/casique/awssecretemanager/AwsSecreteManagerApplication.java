package com.casique.awssecretemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class AwsSecreteManagerApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(AwsSecreteManagerApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000L)
	public void foo(){
		System.out.println(jdbcTemplate.queryForObject("select 1", String.class));
	}
}
