package chapter07;

public class Exercise_07_20 {
    public static void main(String[] args) {
        int[] numbers = {7, 9, 11, 21, 1, 1, 3, 4,  4, 5, 7};
        sort(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
    public static void sort(int[] list){

        for (int i = 0; i < list.length; i++) {
                int currentMax = list[i];
                int currentIndex = i;
                for (int j = i + 1; j < list.length; j++) {
                    if (currentMax > list[j]) {
                        currentMax = list[j];
                        currentIndex = j;
                    }
                }

                if (currentIndex != i) {
                    list[currentIndex] = list[i];
                    list[i] = currentMax;
                }
            }
        }

}
