package Assignment_01;

import java.util.Scanner;

public class QuadraticEquation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a, b and c:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	double D=b*b - 4 * a * c;
	if(D>0) {
		double root1=(-b+Math.sqrt(D))/(2*a);
		double root2=(-b-Math.sqrt(D))/(2*a);
	    System.out.println("Roots are real and different");
        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);
	}
	else if(D==0) {
		double root=-b/(2*a);
	    System.out.println("Roots are real and same");
        System.out.println("Root = " + root);
	}
	else {
	    System.out.println("Roots are complex and imaginary");
	}
	sc.close();
}
}
