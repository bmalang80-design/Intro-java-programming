package chapter06;

import java.util.Scanner;

public class Exercise_06_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: B");
        String password = scanner.next();
        boolean pass = check(password);
        System.out.println(pass);


    }
      public static boolean check(String password){

          for (int i = 0; i < password.length() ; i++) {
              if (Character.isLetter(password.charAt(i)) && Character.isDigit(password.charAt(i)) ){
                  return true;
              }
          }
          if(password.length() < 8){
              return false;
          }
          int count = 0;
          for (int i = 0; i < password.length() ; i++) {
              if (Character.isDigit(password.charAt(i))){
                  count++;
              }
          }
          if (count == 2){
              return true;
          }else {
              return false;
          }

      }
}
