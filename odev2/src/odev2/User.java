package odev2;

public class User {
	int id;
	String firstName;
	String lastName;
	String lesson;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String lesson) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lesson = lesson;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	
	
	
	
	

}
