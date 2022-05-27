package com.lt.bean;

public class GradeCard {
	private int semester;

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public GradeCard(int semester) {
		super();
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "GradeCard [semester=" + semester + "]";
	}
	
	
	
	
	

}
