package Assignment_01;

import java.util.Scanner;

public class GeometricMean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
	    int n = sc.nextInt();
	    double product=1;
	    for(int i=1;i<=n;i++) {
	    	  System.out.println("Enter Number " + i + " : ");
	     double num=sc.nextDouble();
	     product=product*num;
	      }
	      double gm=Math.pow(product, 1.0/n);
	      System.out.println("Geometric Mean = " + gm);
	      sc.close();
	}
	
}
