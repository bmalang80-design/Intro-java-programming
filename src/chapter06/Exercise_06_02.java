package chapter06;

import java.util.Scanner;

public class Exercise_06_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.println(sumOfDigits(scan.nextInt()));
    }

    public static int sumOfDigits(long n) {
        int count = (int) n;
        int sum = 0;
        while (count != 0) {
            int number = (int) count % 10;
            sum += number;
            count /= 10;
        }
        return sum;
    }
}
