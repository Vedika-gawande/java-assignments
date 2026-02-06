package Assignment_01;

import java.util.Scanner;

public class MultipleOf5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no to check it is multiple of 5 : ");
	int num=sc.nextInt();
	if(num%5==0) {
		System.out.println("Number is multiple of 5 :" + num);
	}else {
		System.out.println("Number is not multiple of 5 :" + num);
	}
	sc.close();
}
}
