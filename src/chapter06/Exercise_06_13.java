package chapter06;

public class Exercise_06_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%n", "1", "m(i)");
        System.out.println("----------------");
        double count = 0;
        for (int i = 1; i <= 20 ; i++) {
            double sum =  sumSeries(i);
            count += sum;
            System.out.printf("%-10d%-10.4f%n", i, count);
        }

    }
    public static double sumSeries(int num){
     return (double) num / (num + 1);
    }
}
