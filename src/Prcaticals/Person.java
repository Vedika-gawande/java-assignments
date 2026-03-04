package Prcaticals;
public class Person {
	String name;
	int age;
	String city;
	
	Person(String name,int age,String city){
		this.name=name;
		this.age=age;
		this.city=city;
	}
	long AadharNo;
	String email;
	Person(String email,int AadharNo){
		this.email=email;
		this.AadharNo=AadharNo;
	}
	void display_info1() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);
	}
	void display_info2() {
		System.out.println("Email : " + email);
		System.out.println("Aadhar No : " + AadharNo);
	}
	public static void main(String[] args) {
		Person p=new Person("Vedika",19,"Ner");
		Person p1=new Person("vedika@gmail.com",96469);
		p.display_info1();
		p1.display_info2();
	}
	
}
