package odev2;

public class UserManager {
	
	public void makeComment(User user,String comment) {
		System.out.println(user.getFirstName()+ " þu yorumu yaptý : "+comment);
	}
	
	public void updateComment(User user, String newName) {
		newName=user.getFirstName().replaceAll(user.getFirstName(), newName);
		System.out.println(user.getFirstName() + " your firstname has been changed to "+newName);
	}
	
	public void list(User user) {
		System.out.println(user);
	}

}
