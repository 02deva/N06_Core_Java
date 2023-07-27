package org.tnsif.multilevelinheritance;
//parent class 
public class Manager {
	
	// private data members
	private String DepartmentNmae;
	private String NameofManager;
	private int empId;
	
	// getters and setters
	public String getDepartmentNmae() {
		return DepartmentNmae;
	}
	public void setDepartmentNmae(String departmentNmae) {
		DepartmentNmae = departmentNmae;
	}
	public String getNameofManager() {
		return NameofManager;
	}
	public void setNameofManager(String nameofManager) {
		NameofManager = nameofManager;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Manager [DepartmentNmae=" + DepartmentNmae + ", NameofManager=" + NameofManager + ", empId=" + empId+ "]";
	}
	
	// parameterized constructor
	public Manager(String departmentNmae, String nameofManager, int empId) {
		super();
		DepartmentNmae = departmentNmae;
		NameofManager = nameofManager;
		this.empId = empId;
	}
	
	
	
	
	
	

}
