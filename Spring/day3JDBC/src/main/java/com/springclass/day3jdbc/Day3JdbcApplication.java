package com.springclass.day3jdbc;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class Day3JdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Day3JdbcApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... strings) throws Exception{
		List<testDbConn> testDbConnlist = jdbcTemplate.query("SELECT * from test", BeanPropertyRowMapper.newInstance(testDbConn.class));

		for (testDbConn t : testDbConnlist) {
			System.out.println(t);
		}

	}
}
