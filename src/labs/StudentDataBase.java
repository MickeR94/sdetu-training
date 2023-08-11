package labs;

public class StudentDataBase {

	public static void main(String[] args) {
		//Create a student - create a new object
		Student stu1 = new Student("Greger", "9405128970");
		Student stu2 = new Student("Alfons", "9401046596");
		Student stu3 = new Student("Linda", "9412315427");
		
		stu1.enroll("Math151");
		stu1.enroll("English255");
		stu1.enroll("History211");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(1000);
		System.out.println(stu1.toString());

	}
	
}
	
class Student{
		
		//properties
		private String name;
		private String SSN;
		private static int ID = 0;
		private String studentID;
		private String email;
		private String phone;
		private String city;
		private String state;
		private String courses = "";
		private static final int costOfCourse = 800;
		private int balance = 0;
		
		//constructor
	public Student (String name, String SSN) {
		ID++;
		this.SSN = SSN;
		this.name = name;
		setStudentID();
		setEmail();
	}
	
	private void setStudentID() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min));
		random = random + min;
		studentID = ID + "" + random + SSN.substring(5);
		System.out.println("Your student ID: " + studentID);
		
	}
	
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setEmail() {
		email = name.toLowerCase() + "." + ID + "@school.com";
		System.out.println("Your email: " + email);
	}
	public String getEmail() {
		return email;
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\nBALANCE: " + balance + "]";
	}
	
	
}



