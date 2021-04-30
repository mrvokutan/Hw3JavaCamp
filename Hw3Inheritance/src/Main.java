
public class Main {

	public static void main(String[] args) {
		
		Student merve = new Student ();
		merve.setId(111111111);
		merve.seteMail("merve61okutan@gmail.com");
		merve.setAge(22);
		merve.setUniversityName("Karabuk University");
		
		Instructor engin = new Instructor();
		engin.setId(222222222);
		engin.setName("Engin");
		engin.setLocation("Ankara");
		engin.seteMail("engindemirog@gmail.com");
		
		System.out.println(merve.getUniversityName());
		System.out.println(engin.getName());
		
		UserManager userManager = new UserManager();
		// userManager.add(engin);
		// userManager.add(merve);
		
		User[] users = {merve, engin} ;
		userManager.addMultipleUser(users);
	}
		
}
