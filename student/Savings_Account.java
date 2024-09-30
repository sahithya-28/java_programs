package student;
import java.util.Scanner;

class SavingsAccount {
 
    static double annualInterestRate;
    private double savingsBalance;
    static Scanner scanner = new Scanner(System.in);

    public SavingsAccount() {
        System.out.print("Enter the initial savings balance: ");
        savingsBalance = scanner.nextDouble();
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate() {
        System.out.print("Enter the new annual interest rate (as a decimal): ");
        annualInterestRate = scanner.nextDouble();
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
}

public class Savings_Account {
    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate();
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver1 Balance: " + saver1.getSavingsBalance());
        System.out.println("Saver2 Balance: " + saver2.getSavingsBalance());
    }
}
