package Prcaticals;
import java.util.Scanner;

public class ComplexNumber {

    double real;
    double imaginary;

    ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber c) {
        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;
        return new ComplexNumber(r, i);
    }

    // Subtraction
    ComplexNumber sub(ComplexNumber c) {
        double r = this.real - c.real;
        double i = this.imaginary - c.imaginary;
        return new ComplexNumber(r, i);
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + " i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + " i");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first number:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.println("Enter real and imaginary part of second number:");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber diff = c1.sub(c2);

        System.out.println("Sum result:");
        sum.display();

        System.out.println("Difference result:");
        diff.display();

        sc.close();
    }
}