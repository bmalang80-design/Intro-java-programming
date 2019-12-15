package chapter07;

import java.util.Scanner;

public class Exercise_07_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students:");
        int numberOfStudent = scanner.nextInt();
        int[] scores = new int[numberOfStudent];

        System.out.print("Enter " + numberOfStudent + " scores:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
        print(scores);
    }
    public static void print(int[] scores){
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90){
                System.out.println("Student "+ i + " score  is " + scores[i] + " and grade is A");
            }else  if (scores[i] >= 80){
                System.out.println("Student "+ i + " score  is " + scores[i] + " and grade is B");
            }else  if (scores[i] >= 70){
                System.out.println("Student "+ i + " score  is " + scores[i] + " and grade is C");
            }else  if (scores[i] >= 60){
                System.out.println("Student "+ i + " score  is " + scores[i] + " and grade is D");
            }else{
                System.out.println("Student "+ i + " score  is " + scores[i] + " and grade is F");
            }
        }
    }
}
