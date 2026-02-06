package Assignment_01;

import java.util.Scanner;

public class PrimeSeries {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int n=sc.nextInt();
	for(int num=2;num<=n;num++) {
	boolean isPrime=true;
	for(int i=2;i*i<=num;i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
		if(isPrime) {
			System.out.println(num);
		}
	}
		sc.close();
	}
	
}

