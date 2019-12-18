package chapter07;

import java.util.Scanner;

public class Exercise_07_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.println("Enter 5 number: ");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The gcd is " +  gcd(numbers));
    }
    public static int gcd(int... numbers){
        int gcd = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
           gcd =  gcd(gcd, numbers[i]);
        }
        return gcd;
    }
    public static int gcd(int num1, int num2) {
        int count = 2;
        int gcd = 1;
        while (count <= num1 && count <= num2) {
            if (num1 % count == 0 && num2 % count == 0) {
                gcd = count;
            }
            count++;
        }
        return gcd;
    }
}
