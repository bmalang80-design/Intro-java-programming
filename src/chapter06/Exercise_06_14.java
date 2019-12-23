package chapter06;

public class Exercise_06_14 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%n", "1", "m(i)");
        System.out.println("----------------");
        for (int i = 1; i < 1000 ; i += 100) {
            System.out.printf("%-10d%-10.4f%n", i, pi(i));
        }
    }
    public static double pi(int num){
        double pi = 0;
        for (int i = 1; i <= num; i++) {
           pi += Math.pow(-1, i + 1)/ (2 * i - 1);
        }
        return pi * 4;
    }
}
