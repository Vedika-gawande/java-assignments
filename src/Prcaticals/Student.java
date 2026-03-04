package Prcaticals;

public class Student {
	int rollno;
	String name;
	String dept;
	public void info(int rollno,String name,String dept) {
		this.rollno=rollno;
		this.name=name;
		this.dept=dept;
	}
	public void display() {
		System.out.println("Roll no : " + rollno);
		System.out.println("Name: " + name);
		System.out.println("Dept : " + dept);
	}
public static void main(String[] args) {
	 Student s = new Student();
	 s.info(10, "Vedika", "CSE");
	 s.display();
}
}
