package chapter07;

import java.util.Scanner;

public class Exercise_07_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10  numbers: ");

        int count = 0;
        while(count <numbers.length){
            numbers[count] = scan.nextDouble();
            count++;
        }

       double[] list = reverseArrays(numbers);

        System.out.print("Reverse order ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
    public static double[] reverseArrays(double[] list){
        double[] reverse = new double[list.length];
        for (int i = 0, j = reverse.length - 1; i < list.length; i++, j--) {
            reverse[j] = list[i];

        }
        return reverse;
    }
}
