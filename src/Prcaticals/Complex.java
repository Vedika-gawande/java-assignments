package Prcaticals;
import java.util.Scanner;
public class Complex {
	 double real;
	 double imaginary;
	 Complex(){
		 this.real=0;
		 this.imaginary=0;
	 }
	 Complex(double real,double imaginary){
		 this.real=real;
		 this.imaginary=imaginary;
	 }
	 Complex add(Complex c) {
		 double r=this.real+c.real;
		 double i = this.imaginary+c.imaginary;
		 return new Complex(r,i);
	 }
	 Complex add(double value) {
		 return new Complex(this.real+value,this.imaginary);
	 }
	 Complex sub(Complex c) {
		 double r = this.real-c.real;
		 double i = this.imaginary-c.imaginary;
		 return new Complex(r,i);
	 }
	 Complex sub(double value) {
		 return new Complex(this.real-value,this.imaginary);
	 }
	 void display() {
		 if(imaginary>=0) {
			 System.out.println(real + " + " + imaginary + "i");
		 }
		 else {
			 System.out.println(real + " - " + (-imaginary) + "i");
			 
		 }
	 }
		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the real and imaginary part of first complex number : ");
			 double r1=sc.nextDouble();
			 double i1=sc.nextDouble();
			 System.out.println("Enter the real and imaginary part of second complex number : ");
			 double r2=sc.nextDouble();
			 double i2=sc.nextDouble();
			 Complex c1 = new Complex(r1,i1);
			 Complex c2 = new Complex(r2,i2);
			 
			 Complex sum=c1.add(c2);
			 Complex diff=c1.sub(c2);
			 
			 System.out.println("Addition result : ");
			 sum.display();
			 System.out.println("Substarction result : ");
			 diff.display();
			 
			 Complex overloadAdd=c1.add(5);
			 System.out.println("After adding 5 to real part : ");
			 overloadAdd.display();
			 sc.close();
		 }
	 }
