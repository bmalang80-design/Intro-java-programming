package chapter06;

public class Exercise_06_09 {
    public static void main(String[] args) {
        System.out.printf("%-13s%-13s%-13s%-13s%-13s%n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("----------------------------------------------------------");

        for (double f = 1, m = 20; f <= 10 ; f++, m +=5) {
            System.out.printf("%-13.1f%-13.3f%-13s%-13.1f%-13.3f%n", f, footToMeter(f), "|", m, meterToFoot(m));
        }

    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
