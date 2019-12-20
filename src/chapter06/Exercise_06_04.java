package chapter06;

import java.util.Scanner;

public class Exercise_06_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        reverse(number);

    }
    public static void reverse(int number){
        String s = "";

        while (number != 0 ){
            int reverse = number % 10;
            s += reverse;
            number /= 10;
        }
        System.out.println(s);
    }
}
