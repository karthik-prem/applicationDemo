package com.demo.project.firstSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class TeamMember implements TaskSeparator{
 
	public String performTask(String task) {
		return "task assigned is for Team Member" + task;
	}
}
