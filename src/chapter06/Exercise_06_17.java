package chapter06;

import java.util.Scanner;

public class Exercise_06_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        printMatrix(scan.nextInt());
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
