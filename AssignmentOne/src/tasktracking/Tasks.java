package tasktracking;

import java.util.Date;

public class Tasks {

	private int taskId;
	private String taskName;
	private String taskDescription;
	private Date taskStartDate;
	private Date taskEndDate;
	private String taskStatus;
	private int projectId;

	// CONSTRUCTORS
	public Tasks() {

	}

	public Tasks(int taskId, String taskName, String taskDescription,
			Date taskStartDate, Date taskEndDate, String taskStatus,
			int projectId) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskStartDate = taskStartDate;
		this.taskEndDate = taskEndDate;
		this.taskStatus = taskStatus;
		this.projectId = projectId;
	}

	// SETTERS
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	// GETTERS
	public int getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public Date getTaskStartDate() {
		return taskStartDate;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public int getProjectId() {
		return projectId;
	}

}
