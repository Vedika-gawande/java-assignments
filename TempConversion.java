package Assignment_01;
import java.util.Scanner;
public class TempConversion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temp in celsius : ");
	double cel=sc.nextDouble();
	double fah=(cel*9/5)+32;
	System.out.println("Temperature in Fahrenheit : " + fah);
	sc.close();
}
}
