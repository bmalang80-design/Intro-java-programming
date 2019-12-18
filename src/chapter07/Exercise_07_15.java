package chapter07;

import java.util.Scanner;

public class Exercise_07_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        int count = 0;

        while (count < numbers.length){
            numbers[count] = scan.nextInt();
            count++;
        }

        int[] newNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < newNumbers.length ; i++) {
            if (newNumbers[i] > 0)
            System.out.print(newNumbers[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] result = new int[list.length];

        int i = 0;
        for (int ele: list) {
            if (check(result, ele)){
                result[i] = ele;
            }
            i++;
        }
        return result;
    }
    public static boolean check(int[] list, int key){
        for (int i = 0; i < list.length ; i++) {
            if (key == list[i]){
                return false;
            }
        }
        return true;
    }
}
