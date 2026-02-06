package Assignment_01;

public class ArraySum {
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int sum=0;
		for (int i=0;i<arr1.length;i++) {
		 sum=sum+arr1[i];
		}
		System.out.println("Sum : " + sum);
	}
}
