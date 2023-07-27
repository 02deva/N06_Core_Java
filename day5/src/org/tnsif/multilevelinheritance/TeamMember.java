package org.tnsif.multilevelinheritance;

public class TeamMember extends TeamLead {
	
	private int size;
	private int duration;
	

	

	public TeamMember(String departmentNmae, String nameofManager, int empId, String leadname, String projectName,
			int size, int duration) {
		super(departmentNmae, nameofManager, empId, leadname, projectName);
		this.size=size;
		this.duration=duration;
	}

	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

}
