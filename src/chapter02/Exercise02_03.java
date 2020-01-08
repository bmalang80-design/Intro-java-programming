package chapter02;

import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value for fee: ");
        double feet = scan.nextDouble();
        double meter = feet * 0.305;
        System.out.println(feet +" feet is " + meter + " meters");
    }

}
