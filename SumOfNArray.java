package Assignment_01;

import java.util.Scanner;

public class SumOfNArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array :");
	int n =sc.nextInt();
	int [] arr=new int[n];
	System.out.println("Enter the elements of array :");
	for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("Sum = " + sum);
	sc.close();
}
}
