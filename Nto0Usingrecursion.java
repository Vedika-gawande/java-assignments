package Assignment_01;

import java.util.Scanner;

public class Nto0Usingrecursion {
static void func(int n) {
	if(n==0) return;
	System.out.println(n);
	func(n-1);
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int n =sc.nextInt();
	func(n);
	sc.close();
}
}
