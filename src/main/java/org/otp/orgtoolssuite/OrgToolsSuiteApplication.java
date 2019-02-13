package org.otp.orgtoolssuite;

import org.otp.orgtoolssuite.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.otp.orgtoolssuite")
@SpringBootApplication
public class OrgToolsSuiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgToolsSuiteApplication.class, args);
	}

}

