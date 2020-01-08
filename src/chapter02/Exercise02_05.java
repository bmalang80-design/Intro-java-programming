package chapter02;

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scan.nextDouble();
        double gratuity = scan.nextDouble();
        double tip = (subtotal * gratuity / 100);
        double total = subtotal + tip;
        System.out.println("The gratuity is $" +tip + " and total is $"+ total);
    }
}
