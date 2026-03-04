package Prcaticals;

public class Calculate {
	Calculate(int a ,int b){
		System.out.println("Add : "+(a+b));
	}
	Calculate(int a ,int b,int c){
		System.out.println("Add : "+(a+b+c));
	}
	Calculate(float a ,float b,int c){
		System.out.println("Add : "+(a+b+c));
	}
	public static void main(String[] args) {
		new Calculate(10,20);
		new Calculate(10,20,30);
		new Calculate(1.6f,9.7f,30);
	}
}
