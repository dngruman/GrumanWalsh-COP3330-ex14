import java.util.Scanner;
import java.lang.Math;

public class TaxCalculator {
    public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
        double amount, tax, total;
        String state;

    System.out.print("What is the order amount? ");
    amount = user_input.nextDouble();
    System.out.print("What is the state? ");
    state = user_input.next();

    if(state.equalsIgnoreCase("WI")) {
        // Calculate tax amount.
        tax = 5.5/10;
        // User Output for Wisconsin Tax
        System.out.printf("The subtotal is $%.2f\n", amount);
        System.out.printf("The tax is $%.2f\n", tax);
    } else {
        tax = 0;
    }

    // Calculate total amount and print output to user
    total = amount + tax;

    System.out.printf("The total is $%.2f\n", total);
    }
}

