package chapter33;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Map;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILO_POUND = 0.45359237;
    public static final double METER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getBMI(){
        double bm = weight * KILO_POUND  / ((height * METER_INCH) * (height * METER_INCH));
        return Math.round(bm * 100) / 100.0;
    }
    public String getStatus(){
        double b = getBMI();
        if (b < 18.5){
            return "Underweight";
        }else if(b < 25){
            return "Normal";
        }else if(b < 30){
            return "Overweight";
        }else {
            return "Obese";
        }
    }
}
