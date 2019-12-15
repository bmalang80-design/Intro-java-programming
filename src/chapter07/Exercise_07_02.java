package chapter07;

import java.util.Scanner;

public class Exercise_07_02 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number up 10");
        int newNum;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int [] newN = reverse(numbers);
        print(newN);
    }
    public static  void print(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static int[] reverse(int[] numbers){
        int[] reverse = new int[numbers.length];
        for (int i = 0, j = reverse.length -1; i <numbers.length ; i++, j--) {
            reverse[j] = numbers[i];
        }
        return reverse;
    }
}
