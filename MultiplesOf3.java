package Assignment_01;
import java.util.Scanner;
public class MultiplesOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=10;i<50;i++) {
		if(i%3==0) {
			System.out.println("Multiple of 3 :" + i);
		}
		sc.close();
	}

}
}
