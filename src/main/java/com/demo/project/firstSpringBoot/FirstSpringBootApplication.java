package com.demo.project.firstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		//TeamMangerImpl team=new TeamMangerImpl(new SupportEngineer());
		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstSpringBootApplication.class, args);
		TeamMangerImpl team= applicationContext.getBean(TeamMangerImpl.class);
		String output=team.acceptTasks("pls test");
		System.out.println(output);
		
	}

}
