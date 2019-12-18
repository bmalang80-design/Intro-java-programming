package chapter07;

public class Exercise_07_13 {
    public static void main(String[] args) {
        int numbers = getRandom(2, 3,45, 53, 51, 34, 23, 11, 12, 32, 37);
        System.out.println(numbers);
    }
    public static int getRandom(int... numbers){
        int random;
        boolean input;
       do {
           input = false;
           random = (int)(Math.random() * 54) + 1 ;
           for (int num: numbers){
               if (num == random){
                   input = true;
               }
           }
       }while (input);

       return random;
    }
}
