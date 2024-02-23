package designpatterns.structural.adapter;

public class CollegeStudent implements Student{

	private String name;
	private String surName;

	public CollegeStudent(String name, String surName) {
		this.name = name;
		this.surName = surName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSurName() {
		return surName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "CollegeStudent [name=" + name + ", surName=" + surName + "]";
	}
	
	
}
