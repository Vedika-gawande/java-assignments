package Assignment_01;
import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array : ");
	int n=sc.nextInt();
	int i=0;
	boolean found=false;
	int[] arr=new int[n];
	System.out.println("Enter the elements of Array : ");
	for(i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the number to search : ");
	int num=sc.nextInt();
	for(i=0;i<arr.length;i++){
	if(arr[i]==num) {
		found=true;
		break;
	}
}
	if(found) 
		System.out.println("Number found : " + num);
	else 
		System.out.println("Number not found  " );
	sc.close();
}
}
