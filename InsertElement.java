package Assignment_01;
import java.util.Scanner;
public class InsertElement {
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
	System.out.println("Enter the element to insert  : ");
	int element =sc.nextInt();
	System.out.println("Enter the position to insert  : ");
	int pos =sc.nextInt();
	int[] newAry=new int[n+1];
	
	for(i=0;i<pos-1;i++) {
		newAry[i]=arr[i];
	}
	newAry[pos-1]=element;
	for(i=pos-1;i<n;i++) {
		newAry[i+1]=arr[i];
	}
	 System.out.println("Array after insertion:");
     for (i = 0; i < newAry.length; i++) {
         System.out.print(newAry[i] + " ");
     }
	sc.close();
}
}
