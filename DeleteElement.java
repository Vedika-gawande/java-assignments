package Assignment_01;

import java.util.Scanner;

public class DeleteElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=0;
	System.out.println("Enter the size of array  : ");
	int n =sc.nextInt();
	System.out.println("Enter the array elements : ");
	int []arr=new int[n];
	for( i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the element to delete  : ");
	int pos =sc.nextInt();
	int[] newAry=new int[n-1];
	for(i=0;i<pos-1;i++) {
		newAry[i]=arr[i];
	}
	for(i=pos;i<n;i++) {
		newAry[i-1]=arr[i];
	}
	System.out.println("Array after deletion:");
	for (i = 0; i < newAry.length; i++) {
	    System.out.print(newAry[i] + " ");
	}
	sc.close();
}
}
