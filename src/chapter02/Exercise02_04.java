package chapter02;

import java.util.Scanner;

public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = scan.nextDouble();
        double kilo = pound * 0.454;
        System.out.println(pound + " pounds is "+ kilo + " kilograms");
    }
}
