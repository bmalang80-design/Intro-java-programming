package chapter33;

import java.util.Date;
import java.util.regex.Matcher;

public class Loan  {
    private double annualInterestRate;
    private  int numberOfYears;
    private java.util.Date loanDate;
    private double amount;
    public Loan(){

    }
    public Loan(double annualInterestRate, int numberOfYears, double amount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanDate = new Date();
        this.amount = amount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double monthlyPayment(){
        double monthlyInterestPayment = annualInterestRate /1200;
        double monthlyPayment = amount * monthlyInterestPayment /(1 - (1 / Math.pow(1 + monthlyInterestPayment, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        return monthlyPayment() * numberOfYears * 12;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
