package Assignment_01;
import java.util.Scanner;
public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side a : ");
		double a=sc.nextDouble();
		System.out.println("Enter the side b : ");
		double b=sc.nextDouble();
		System.out.println("Enter the side c : ");
		double c=sc.nextDouble();
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle : " + area);
		sc.close();
	}

}
