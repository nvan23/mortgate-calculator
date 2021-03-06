package com.nvan23;

public class Main {

    public static void main(String[] args) {
        implementMortgageCalculator();
    }

    private static void implementMortgageCalculator() {
        int principal = (int) Console.readNUmber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNUmber("Annual Interest Rate (1 - 30): ", 1, 30);
        byte years = (byte) Console.readNUmber("Period (1 - 30 Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}


