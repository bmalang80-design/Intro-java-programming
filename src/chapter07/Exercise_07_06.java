package chapter07;

public class Exercise_07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int number = 2;
        int count = 0;
        System.out.println("The first 50 numbers are");
        while (count < 50){

            boolean isPrime = true;

            for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number) ; i++) {
                if (number % primeNumbers[i] == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers[count] = number;
                count++;
                if (count % 10 == 0){
                    System.out.println(number);
                }else{
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
