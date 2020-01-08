package chapter02;

import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter th number of minutes: ");
        int minutes = scan.nextInt();
        int years = minutes / 525600;
        minutes = (minutes % 525600) / 1440;
        int days = minutes;

        System.out.println(minutes + " minutes is approximately " + years + " years and "+ days + " days" );

    }
}
