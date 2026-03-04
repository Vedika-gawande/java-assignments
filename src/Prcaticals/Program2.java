package Prcaticals;

public class Program2 {
	
	public void add(int a,int b) {
		System.out.println("Add = "+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("Add = "+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("Add = "+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("Add = "+(a+b));
	}
	public static void main(String [] args) {
		Program2 p =new Program2();
		p.add(10,20);
		p.add(10,2.8f);
		p.add(1.0f,20);
		p.add(1.0f,2.5f);
	}
	
}
