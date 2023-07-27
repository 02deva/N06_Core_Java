package org.tnsif.multilevelinheritance;
public class TeamLead  extends Manager{
	
	private String Leadname;
	private String projectName;
	
	
	public String getLeadname() {
		return Leadname;
	}
	public void setLeadname(String leadname) {
		Leadname = leadname;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public TeamLead(String departmentNmae, String nameofManager, int empId, String leadname, String projectName )	
	{
		super(departmentNmae, nameofManager, empId);
		this.Leadname = leadname;
		this.projectName = projectName;
			
	}
	@Override
	public String toString() {
		return "TeamLead [Leadname=" + Leadname + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
