package chapter07;

import java.security.SecureRandom;
import java.util.Random;

public class Exercise_07_16 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100000);
        }
        int key = (int)(Math.random() * 100000);
        long startTime = System.nanoTime();
            linearSearch(numbers, key);
        long endTime = System.nanoTime();
        long executeTime = endTime - startTime;
        System.out.println("Execution time for linear search is: "+ executeTime + " nanosecond");
        System.out.println("Execution time for linear search is: "+ second(executeTime) + " second");

        System.out.println();

         sort(numbers);
         startTime = System.nanoTime();
         binarySearch(numbers, key);
         endTime = System.nanoTime();
         executeTime = endTime - startTime;
        System.out.println("Execution time for binary search is: "+ executeTime + " nanosecond");
        System.out.println("Execution time for binary search is: "+ second(executeTime) + " second");
    }
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length ; i++) {
            if (list[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;

        while (high >= low){
            int mid = (low + high)/ 2;
            if ( key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return - low -1;
    }
    public static void sort(int[] list){
        for (int i = 0; i <list.length - 1; i++) {
            int currentElements = list[i];
            int currentIndex = i;
            for (int j = i + 1; j < list.length ; j++) {
                if (currentElements > list[j]){
                    currentElements = list[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i){
                list[currentIndex] = list[i];
                list[i] = currentElements;
            }
        }
    }

    /*Convert nanosecond to second*/
    public static double second(long num){
        double result;
        result = (double)num *  Math.pow(10, -9);
        return result;
    }
}
