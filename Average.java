package Assignment_01;
public class Average {
public static void main(String[] args) {
	int arr1[]= {10,20,30,40,50};
	int sum=0;
	for (int i=0;i<arr1.length;i++) {
	 sum=sum+arr1[i];
	 
	}
	double avg=(double)sum/arr1.length;
	System.out.println("Sum : " + sum);
	System.out.println("Avg : " + avg);

}
}
