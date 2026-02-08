package Assignment_01;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str = sc.nextLine(); 
	boolean isPalindrome=true;
	char[] ch=str.toCharArray();
	int start=0,end=ch.length-1;
	while(start<end) {
		if(str.charAt(start)!=str.charAt(end)) {
			isPalindrome=false;
			break;
		}
		start++;
		end--;
	}
	if(isPalindrome)
		System.out.println("String is palindrome : "+ str);
	else
		System.out.println("String not is palindrome : "+ str);

	sc.close();
}
}
