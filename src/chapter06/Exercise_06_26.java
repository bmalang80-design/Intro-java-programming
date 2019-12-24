package chapter06;

public class Exercise_06_26 {
    public static void main(String[] args) {
        int count = 1;
        int prime = 100;
        int number = 2;
        while (count < prime) {
             if (isPrime(number) && isPalindrome(number)) {
                 System.out.print(number + " ");
                 if (count % 10 == 0){
                     System.out.println(number);
                 }
                 count++;
             }
             number++;
       }

    }
    public static int reverse(int num){
        int reverse = 0 ;
        while (num != 0){
            int last = num % 10;
            reverse = reverse * 10 + last ;
            num = num / 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int num){
        if (reverse(num) != num){
            return false;
        }
        return true;
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num / 2 ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
