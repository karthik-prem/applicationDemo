package com.demo.project.firstSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tester implements TaskSeparator {

	@Override
	public String performTask(String task) {
		return "task is assigned to tester";
	}
}
