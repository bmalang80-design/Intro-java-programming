package chapter06;

public class Exercise_06_01{
    public static void main(String[] args) {
        System.out.println("\t\t\t\tPentagon numbers are:");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 10 == 0){
                System.out.println();
            }else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
        }
    }
    public static int getPentagonalNumber(int number){
        if (number == 1) {
            return 1;
        }
        return (number * (3 * number - 1)) / number;
    }
}
