package Assignment_01;

import java.util.Scanner;

public class AddUForLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			sum=sum+i;
		}
	}
	System.out.println("Sum of even numbers : "+sum);
	sc.close();
		
}
}
