package Assignment_01;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array : ");
	int n=sc.nextInt();
	int i=0;
	boolean found=false;
	int[] arr=new int[n];
	System.out.println("Enter the elements of Array in sorted order: ");
	for(i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the number to search : ");
	int num=sc.nextInt();
	int low=0,high=n-1;
	while(low<=high) {
	int mid=(low+high)/2;
		if(arr[mid]==num) {
			found=true;
			break;
		}
		else if(arr[mid]>num) {
			high=mid-1;
		}
		else{
			low=mid+1;
		}
	}
		if(found) 
			System.out.println("Number found : " + num);
		else 
			System.out.println("Number not found  " );
		sc.close();
	}
}

