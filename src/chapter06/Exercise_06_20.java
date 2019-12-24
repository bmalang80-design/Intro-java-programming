package chapter06;

import java.util.Scanner;

public class Exercise_06_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.next();
        int letters = countLetters(password);
        System.out.println("Numbers of letters " + letters);
    }
    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
