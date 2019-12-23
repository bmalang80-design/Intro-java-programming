package chapter06;

public class Exercise_06_16 {
    public static void main(String[] args) {

        for (int i = 2000; i <= 2020 ; i++) {
            System.out.println(i + " has " + numberOfDaysInYear(i));
        }
    }
    public static int numberOfDaysInYear(int year){
        int result;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            result = 366;
        }else {
            result = 365;
        }
       return result;
    }
}
