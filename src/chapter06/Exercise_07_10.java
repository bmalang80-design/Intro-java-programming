package chapter06;

public class Exercise_07_10 {
    public static void main(String[] args) {
        System.out.printf("%25s%n", "Prime Numbers");
        System.out.println();
        int count = 1;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)){
                if (count % 10 ==0){
                    System.out.println();
                }else {
                    if(i  < 1000){
                        System.out.print(i + "\t\t");
                    }else {
                        System.out.print(i + "\t");
                    }
                }
                count++;
            }
        }
    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= number/2 ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
