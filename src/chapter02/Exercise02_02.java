package chapter02;

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a radius and length of a cylinder:  ");
        double radius = scan.nextDouble();
        double length = scan.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + String.format("%.4f", area));
        System.out.println("The volume is " + String.format("%.1f", volume));
    }
}
