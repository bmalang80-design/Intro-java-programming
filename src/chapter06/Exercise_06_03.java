package chapter06;

import java.util.Scanner;

public class Exercise_06_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        System.out.println("Reverse order: "+reverse(number));
        System.out.println( (isPalindrome(number) ?  number +" is a palindrome" : number +" is not a palindrome"));
    }
    public static int reverse(int number){
        String s = "";
        int count = number;
        while (count != 0){
            int num = count % 10;
            s += num;
            count /= 10;
        }

        return Integer.parseInt(s);
    }
    public static boolean isPalindrome(int number){
        if (reverse(number) == number)
       return true;

        return false;
    }
}
