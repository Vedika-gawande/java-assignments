package Assignment_01;

import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double pi=3.14;
	System.out.println("Enter the radius of cirle : ");
	double radius=sc.nextDouble();
	double area=(pi*radius*radius);
	System.out.println("Area : " + area);
	double circum=2*(pi*radius);
	System.out.println("Cirumference : " + circum);
	sc.close();
}
}
