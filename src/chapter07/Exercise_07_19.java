package chapter07;

import java.util.Scanner;

public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int[] numbers = new  int[scan.nextInt()];

        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        boolean isSorted = isSorted(numbers);
        sort(numbers);
        System.out.print("The list has " + numbers.length +" integers ");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
       if (isSorted){
           System.out.println("The list is already sorted");
       }else {
           System.out.println("The list is not sorted");
       }
    }
    //sort if not sorted
    public static void sort(int[] list){
        boolean next = true;
        for (int i = 1; i < list.length && next ; i++) {
            next = false;
            for (int j = 0; j < list.length - i ; j++) {
                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    next = true;
                }
            }
        }
    }

    public static boolean isSorted(int[] list){
        boolean next = true;
        for (int i = 1; i < list.length && next; i++) {
            next = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]){
                    return false;
                }
                }
            }
        return  true;
        }
    }

