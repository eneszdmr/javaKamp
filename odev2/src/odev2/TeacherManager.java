package odev2;

public class TeacherManager extends UserManager{
	
	public void addCourse(Teacher teacher, String courseName) {
		
		System.out.println(teacher.getFirstName() +  " adl� e�itmen kursu ekledi " +courseName);
		
	}

}
