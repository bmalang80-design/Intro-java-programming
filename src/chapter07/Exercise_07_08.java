package chapter07;

import java.util.Scanner;

public class Exercise_07_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 double values: ");

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = scan.nextDouble();
        }
      double ave = average(numbers);
        System.out.println("The average value is: "+ ave);
    }
    public static int average(int[] arrays){
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        return sum/arrays.length;
    }
    public static double average(double[] arrays){
        double sum = 0;
        for (int i = 0; i <arrays.length ; i++) {
           sum += arrays[i];
        }
        return sum / arrays.length;
    }
}
