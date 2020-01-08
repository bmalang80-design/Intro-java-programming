package chapter02;

import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = scan.nextInt();
        long totalMillisecond = System.currentTimeMillis();

        long currentSecond = totalMillisecond /1000;
        long second = currentSecond % 60;

        long currentMinutes = currentSecond / 60;
        long minutes = currentMinutes % 60;

        long currentHour = currentMinutes / 60;
        long hour = currentHour % 24;

        System.out.println("The current time is "+ (hour + gmt)+":"+minutes+":"+second);
    }
}
