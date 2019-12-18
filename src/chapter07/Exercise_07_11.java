package chapter07;

import java.util.Scanner;

public class Exercise_07_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10  numbers: ");

        int count = 0;
        while(count <numbers.length){
            numbers[count] = scan.nextDouble();
            count++;
        }
        System.out.printf("The mean is %.2f%n" , mean(numbers));
        System.out.printf("The standard deviation is %.2f%n" , stdv(numbers));
    }
    public static double mean(double[] list){
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }
    public static double stdv(double[] list){
        double mean = Math.floor(mean(list));
        double stdv1 = 0;
        double stdv2 = 0;
        for (int i = 0; i < list.length ; i++) {
            if (list[i] < mean){
               // stdv1 += Math.sqrt( (mean - list[i]) / (list.length - 1));
               // System.out.println(Math.sqrt( (mean - list[i]) / (list.length - 1)));
                continue;
            }else {
                stdv1 += Math.sqrt((list[i] - mean) / (list.length - 1));
            }


        }
        return  stdv1;
    }
    }


