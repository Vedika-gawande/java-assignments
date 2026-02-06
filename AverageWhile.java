package Assignment_01;
import java.util.Scanner;
public class AverageWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[]= {10,20,30,40};
	int i=0,sum=0;
	while(i<arr.length) {
		sum=sum+arr[i];
		i++;
	}
	double avg=(double) sum/arr.length;
	System.out.println("Sum = " + sum);
	System.out.println("Avg = " + avg);
	sc.close();
}
}
