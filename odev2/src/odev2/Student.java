package odev2;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {

	private List<String> myLessons= new ArrayList<>();
	private String myClasses;
	
	
	public Student() {
		
	}

	

	public Student(int id, String firstName, String lastName, String email, String userName, int age) {
		super(id, firstName, lastName, email, userName, age);
		// TODO Auto-generated constructor stub
	}



	public Student(List<String> myLessons, String myClasses) {
		super();
		this.myLessons = myLessons;
		this.myClasses = myClasses;
	}


	public List<String> getMyLessons() {
		return myLessons;
	}


	public void setMyLessons(List<String> myLessons) {
		this.myLessons = myLessons;
	}


	public String getMyClasses() {
		return myClasses;
	}


	public void setMyClasses(String myClasses) {
		this.myClasses = myClasses;
	}
	
	
	public void lessonEkle(String lesson) {
		this.myLessons.add(lesson);
	}
	
}
