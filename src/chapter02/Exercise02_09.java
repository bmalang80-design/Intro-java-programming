package chapter02;

import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the v0, v1, and t: ");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double t = scan.nextDouble();
        double a  = (v1 - v0) / t;
        System.out.println("The average acceleration is "+ a);
    }
}
