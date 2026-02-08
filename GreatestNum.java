package Assignment_01;
import java.util.Scanner;
public class GreatestNum {
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
	int greatest=arr[0];
	for(i=0;i<arr.length;i++) {
	if(arr[i]>greatest) {
		greatest=arr[i];
	}
	}
	System.out.println("Greatest =" + greatest);
	sc.close();
}
}
