package chapter06;

import java.util.Scanner;

public class Exercise_06_05{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double number3 = scan.nextDouble();

        displaySortedNumbers(number1, number2, number3);
    }
    public static void displaySortedNumbers(double n1, double n2, double n3){
        double temp;
        if (n1 > n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if(n2 > n3){
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n1 +" "+ n2 +" "+ n3);

    }
}
