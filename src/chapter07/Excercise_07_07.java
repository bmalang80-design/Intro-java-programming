package chapter07;

public class Excercise_07_07 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;

        while (count < 100){
            int ran = (int)(Math.random() * 10);
            numbers[ran]++;
            count++;
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Numbers of " + i + " is "+ numbers[i]);
        }
    }


}
