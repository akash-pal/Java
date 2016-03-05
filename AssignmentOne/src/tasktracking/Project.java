package tasktracking;

import java.util.Date;

public class Project {

	private int projectId;
	private String projectName;
	private String projectDescription;
	private Date projectStartDate;
	private Date projectEndDate;

	public Project() {

	}

	public Project(int projectId, String projectName,
			String projectDescription, Date projectStartDate,
			Date projectEndDate) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
	}

	// SETTERS
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	// GETTERS
	public int getProjectId() {
		return projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

}
