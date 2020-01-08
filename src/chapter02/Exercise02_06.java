package chapter02;

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scan.nextInt();
       int firstDigits =  number % 10;
            number = number / 10;
        int secondDigits  = number % 10;
        number = number / 10;
        int thridDigits = number % 10;
        //number = number / 10;

        int sum = firstDigits + secondDigits + thridDigits;
        System.out.println("The sum of digits is "+ sum);
    }
}
