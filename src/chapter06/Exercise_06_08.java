package chapter06;

public class Exercise_06_08 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Celsius", "Fahrenheit", "|" , "Fahrenheit" ,"Celsius");
        System.out.println("-------------------------------------------------------------------");
        for (double c = 40, f= 120; c > 30; c--, f -=10) {
            System.out.printf("%-15.1f%-15.1f%-15s%-15.1f%-15.2f%n", c, fahrenheitToCelsius(c),"|", f, celsiusToFahrenheit(f));
        }


    }
    public static double  fahrenheitToCelsius(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    public static double celsiusToFahrenheit (double fahrenheit){
        return (5.0 / 9) * (fahrenheit -32);
    }

}
