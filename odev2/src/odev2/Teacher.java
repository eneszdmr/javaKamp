package odev2;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
	
	private String alan;
	
	private List<String> myCourse = new ArrayList<>();
	
	public Teacher() {}

	public Teacher(String alan, List<String> myCourse) {
		super();
		this.alan = alan;
		this.myCourse = myCourse;
	}

	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

	public List<String> getMyCourse() {
		return myCourse;
	}

	public void setMyCourse(List<String> myCourse) {
		this.myCourse = myCourse;
	}
	
	
	
	
	

}
