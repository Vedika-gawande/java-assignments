package Assignment_01;
public class Product {
public static void main(String[] args) {
	double arr1[]= {1.5,2.6,3.0,4.9,5.3};
	double sum=1;
	for (int i=0;i<arr1.length;i++) {
	 sum=sum*arr1[i];
	}
	System.out.println("Product : " + sum);
}
}
