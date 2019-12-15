package chapter07;

import java.util.Scanner;

public class Exercise_07_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[100];

        double num ;
        double total = 0;
        int count = 0;
        int aboveAverage = 0;

        System.out.print("Enter scores or -1 to quit: ");
        do {
            num = scan.nextDouble();
            numbers[count] = num;
            total += num;
            count++;

        } while (num != -1);

        double average = total / count;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] >= average) {
                aboveAverage++;
            }
        }
        System.out.println("Number of scores above average is: " + aboveAverage);
    }
}
