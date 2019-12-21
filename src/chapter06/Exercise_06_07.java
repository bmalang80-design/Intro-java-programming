package chapter06;

import java.util.Scanner;

public class Exercise_06_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount invested: ");
        double investmentAmount = scan.nextDouble();
        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = scan.nextDouble();

        System.out.printf("%-10s%s%n", "Years", "Future Value");

        for (int i = 1; i <= 30 ; i++) {
            System.out.printf("%-10d%.2f%n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years ){

          return investmentAmount * Math.pow( (1 + (monthlyInterestRate / 100) /12), years * 12);

    }
}
