
public class Student extends User {
	
	private String universityName ;
	private	int age ;
	
	
	public Student() {
		
	}
	public Student(String universityName, int age) {
		super();
		this.universityName = universityName;
		this.age = age;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
