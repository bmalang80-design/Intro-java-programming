package chapter07;

import java.util.Scanner;

public class Exercise_07_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10  numbers: ");

        int count = 0;
        while(count <numbers.length){
           numbers[count] = scan.nextDouble();
            count++;
        }

        System.out.println("The minimum numbers is " + min(numbers));
    }
    public static double min(double[] list){
        double min = list[0];
        for (int i = 0; i < list.length ; i++) {
            if (list[i] < min){
                min = list[i];
            }
        }
        return min;
    }
}
