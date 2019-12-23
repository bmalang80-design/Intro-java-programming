package chapter06;

public class Exercise_06_11 {
    public static void main(String[] args) {

        System.out.printf("%-20s%-20s%n", "Sales Amount", "Commission");
        System.out.println("-------------------------------");
        for (int i = 10000; i <= 100000; i += 5000) {
               System.out.printf("%-20d%-20.1f%n", i, computeCommission(i));
        }
    }
    public static double computeCommission(double salesCommission){
       double commission = 0;
         if (salesCommission > 1 && salesCommission <= 5000){
             commission = salesCommission *  (8.0 / 100);
         }else if(salesCommission > 5000 && salesCommission <= 10000){
             commission = 5000 *  (8.0 / 100) + (salesCommission - 5000) * (10.0 /100);
         }else if(salesCommission >= 10000.01){
             commission = 5000 *  (8.0 / 100) + 5000 * (10.0 /100) + (salesCommission - 10000) * (12.0 /100);
         }
         return commission;
    }
}
