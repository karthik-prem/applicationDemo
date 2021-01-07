package com.demo.project.firstSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SupportEngineer implements TaskSeparator{

	@Override
	public String performTask(String task) {
		return "task is assigned to Suport Engineer" + task;
	}

}
