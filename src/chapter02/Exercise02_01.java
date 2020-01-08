package chapter02;

import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (9.0/ 5) * celsius + 32;

        System.out.println(celsius + " Celsius is "+ fahrenheit + " fahrenheit");
    }
}
