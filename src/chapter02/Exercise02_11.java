package chapter02;

import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
                + (31536000 / 45)) * years);
        System.out.println("The population in " + years + " is " + population);
    }
}
