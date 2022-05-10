package com.wipro.velocity;

public class StudentClass {
	
	private String classId;
    private String className;
    
    //default constructor
	public StudentClass() {
		
	}

	//constructor using fields
	public StudentClass(String classId, String className) {
		this.classId = classId;
		this.className = className;
	}

	//getters and setters
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
    
    
}
