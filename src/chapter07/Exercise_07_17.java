package chapter07;

import java.util.Scanner;

public class Exercise_07_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudent = scanner.nextInt();
        String[] students = new String[numberOfStudent];
        int[] scores = new int[students.length];

        for (int i = 0; i <students.length ; i++) {
            System.out.print("students " + (i + 1) + ": ");
            students[i] = scanner.next();
           // System.out.println();
            System.out.print("Score for student "+ (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        sort(students, scores);
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i] + " "+ scores[i]);
        }
    }
    public static void sort(String[] list, int[] numbers){

        for (int i = 0; i < numbers.length - 1 ; i++) {
            int currentElements = numbers[i];
            int currentIndex = i;
            String temp;
            for (int j = i + 1; j < numbers.length ; j++) {
                if (currentElements > numbers[j]){
                    currentElements = numbers[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i){
                temp = list[i];
                list[i] = list[currentIndex];
                list[currentIndex] = temp;

                numbers[currentIndex] = numbers[i];
                numbers[i] = currentElements;
            }
        }

    }
}
