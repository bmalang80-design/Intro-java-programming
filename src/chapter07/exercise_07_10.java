package chapter07;

import java.util.Scanner;

public class exercise_07_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10  numbers: ");

        int count = 0;
        while(count <numbers.length){
            numbers[count] = scan.nextDouble();
            count++;
        }

        System.out.println("The minimum index of smallest elements is " + indexOfSmallestElements(numbers));
    }
    public static int indexOfSmallestElements(double[] list){
        if (list.length < 1){
            return 0;
        }
        double minElement = list[0];
        int minIndex = 0;
        for (int i = 0; i < list.length ; i++) {
            if (minElement > list[i]){
                minElement = list[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
