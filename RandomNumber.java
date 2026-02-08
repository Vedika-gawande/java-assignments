package Assignment_01;

import java.util.Random;

public class RandomNumber {
public static void main(String[] args) {
	Random rand = new Random();
	int num=rand.nextInt(100);
	System.out.println("Random Number : "+ num);
	if(num%2==0) {
		System.out.println("No is even : " + num);
	}
	else {
		System.out.println("No is odd : " + num);
	}
}
}
