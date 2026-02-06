package Assignment_01;

import java.util.Scanner;

public class PrintNto0 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n =sc.nextInt();
	int i=n;
	while(i>=0) {
		System.out.println(i);
		i--;
	}
	sc.close();
}
}
