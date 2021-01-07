package com.demo.project.firstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamMangerImpl{

	@Autowired
	private TaskSeparator taskSeparator;

	public TeamMangerImpl(TaskSeparator taskSeparator) {
		super();
		this.taskSeparator = taskSeparator;
	}

	public String acceptTasks(String task) {
		String taskAssigned=taskSeparator.performTask(task);
		return taskAssigned;
	}

}
