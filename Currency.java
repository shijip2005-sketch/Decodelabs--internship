import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Base Currency:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        int base = sc.nextInt();

        System.out.println("Select Target Currency:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        int target = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double result = amount;

        // Example Exchange Rate
        double usdToInr = 86.0;
        double inrToUsd = 1 / usdToInr;

        if (base == 1 && target == 2) {
            result = amount * inrToUsd;
            System.out.printf("Converted Amount: %.2f USD\n", result);
        } else if (base == 2 && target == 1) {
            result = amount * usdToInr;
            System.out.printf("Converted Amount: %.2f INR\n", result);
        } else {
            System.out.printf("Converted Amount: %.2f\n", amount);
        }

        sc.close();
    }
}
