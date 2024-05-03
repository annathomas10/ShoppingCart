package com.shoppingcart.awselasticbeanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class AwsElasticBeanstalkApplication {

	public static void main(String[] args)
	{
		//"File > Invalidate Caches / Restart" to reload Intelli J.
		System.out.println("started");
		SpringApplication.run(AwsElasticBeanstalkApplication.class, args);
	}

}
