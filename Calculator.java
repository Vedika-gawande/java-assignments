package Assignment_01;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int a = sc.nextInt();

        System.out.println("Enter Number 2:");
        int b = sc.nextInt();

        System.out.println("Enter Choice:");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");

        int choice = sc.nextInt();   

        switch (choice) {

            case 1:
                System.out.println("Add = " + (a + b));
                break;

            case 2:
                System.out.println("Sub = " + (a - b));
                break;

            case 3:
                System.out.println("Mul = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Div = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}