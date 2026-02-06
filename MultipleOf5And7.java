package Assignment_01;
import java.util.Scanner;
public class MultipleOf5And7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check it is multiple of 5 & 7: ");
		int num=sc.nextInt();
		if(num%5==0 && num%7==0) {
			System.out.println("Number is multiple of 5 & 7 :" + num);
		}else {
			System.out.println("Number is not multiple of 5 & 7:" + num);
		}
		sc.close();
	}
	
}
