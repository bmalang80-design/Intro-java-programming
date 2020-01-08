package chapter02;

import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water kilograms: ");
        double water = scan.nextDouble();
        System.out.print("Enter the initial temperatures: ");
        double initialTem = scan.nextDouble();
        System.out.print("Enter the final temperatures: ");
        double finalTem = scan.nextDouble();

        double q = water * (finalTem - initialTem)* 4184;
        System.out.println("The energy needed is "+ q);

    }
}
