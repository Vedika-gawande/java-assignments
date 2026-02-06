package Assignment_01;
import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check even or odd : ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Number is even : " + num);
		}
		else {
			System.out.println("Number is odd : " + num);
		}
		sc.close();
	}
}
