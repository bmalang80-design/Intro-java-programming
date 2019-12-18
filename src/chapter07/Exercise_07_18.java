package chapter07;

public class Exercise_07_18 {
    public static void main(String[] args) {
        double[] numbers = {10, 4, 8, 7, 9 , 0, 8, 5, 1, -9, 3, 17, -3};
        bubbleSort(numbers);
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }
    public static void bubbleSort(double[] list){
        boolean next = true;
        for (int i = 1; i < list.length && next ; i++) {
            next = false;
            for (int j = 0; j < list.length - i ; j++) {
                if (list[j] > list[j + 1]){
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    next = true;
                }
                
            }
        }
    }
}
