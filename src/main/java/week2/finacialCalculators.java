package week2;

import java.util.Scanner;

public class finacialCalculators {
    // Step 1 : create scanner

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        mortgageCaculator();
    }
    public static void mortgageCaculator (){
        // Cal 1 : A mortgage calculator
        //Monthly Payment (M)
        //- Principal (P): This is the total amount of the loan.
        //- Annual Interest Rate (r): The nominal annual interest rate in
        //decimal form (e.g., 7.625% = 0.07625).
        //- Loan Term in Years (y) How many years the loan lasts.
        //- Number of Monthly Payments (n): This is 12×y (Because
        //there are 12 monthly payments per year.)
        //- Monthly Interest Rate (i): This is the annual interest rate
        //divided by 12, i.e. r/12
        //- Total Interest =(M×n)−P

        // FORMULA = M=P×(i*(1+i)^n / ((1+i)^n)-1)


        // Step 2: create variables from user input
        System.out.println("Enter your loan amount "); // this is principal
        double principal = scanner.nextDouble();

        System.out.println("What is the interest rate?"); // interest rate
        double interest = scanner.nextDouble();
        double convertInterest = interest / 100;
        System.out.println(convertInterest);
        double monthlyInterestRate = convertInterest / 12;

        System.out.println("What is your loan term?"); // how many years the loan lasts
        int loanLength = scanner.nextInt();
        int numOfMonthPayments = 12 * loanLength;


        // calculate math

        double monthlyPayment = principal * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate),numOfMonthPayments))) / (Math.pow((1 + monthlyInterestRate),numOfMonthPayments)-1);

        System.out.printf("This is your monthly payment: $%.2f%n", monthlyPayment);

        // Total interest =(M×n)−P

        double totalInterest = (monthlyPayment * numOfMonthPayments) - principal;

        System.out.printf("This is your total interest: $%.2f%n ",totalInterest);
    }
}
