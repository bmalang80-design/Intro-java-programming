package chapter07;

import java.util.Scanner;

public class Exercise_07_05 {
    public static void main(String[] args) {
    int[] numbers = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int number = 0;
        int count = 0;
        for (int i = 0; i <numbers.length ; i++) {
            number = scan.nextInt();
            if (!check(numbers, number)){
                numbers[i] = number;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is "+ count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
    public static boolean check(int[] numbers, int number){
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }
}
