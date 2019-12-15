package chapter07;

import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise_07_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        System.out.print("Enter integers between 1 and 100:");
        int num = scanner.nextInt();

        while (num != 0){
            numbers[num]++;
            num = scanner.nextInt();
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println( i + " occurs " + numbers[i] + (numbers[i] > 1 ? " times" : " time"));
        }
    }

}
