package chapter06;

import java.util.Scanner;

public class Exercise_06_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number = scan.nextInt();

        displayPattern(number);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int k = i; k < n ; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print( " "+ j);
            }
            System.out.println();
        }
    }
}
