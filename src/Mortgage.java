import java.util.Scanner;

public class Mortgage {
    static double principal;
    static double monthlyInterestRate;
    static double numberOfPayments;

    public static void main(String[] args) {
       double[] inputs = getInputs();

       double annualInterest = inputs[0];
       double periodInYears = inputs[1];

       convertAnnualInterestToMonthly(annualInterest);
       convertAnnualPeriodToAmountOfPayments(periodInYears);

       calculate();
    }

    private static double[] getInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("principal");
        principal = scanner.nextDouble();

        System.out.println("Annual Interest Rate");
        double annualInterest = scanner.nextDouble();

        System.out.println("period in years");
        double periodInYears = scanner.nextDouble();

        return new double[]{annualInterest, periodInYears};
    }

    private static void convertAnnualInterestToMonthly(double annualInterest) {
        double annualInterestToPercent = annualInterest / 100;
        double annualPercentToMonthly = annualInterestToPercent / 12;
        monthlyInterestRate = annualPercentToMonthly;
    }

    private static void convertAnnualPeriodToAmountOfPayments(double periodInYears) {
        numberOfPayments = periodInYears * 12;
    }

    private static  void calculate() {
        double divisionTop = monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double divisionBottom = Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
        double result = principal * divisionTop / divisionBottom;
        System.out.println(Math.round(result));
    }
}
