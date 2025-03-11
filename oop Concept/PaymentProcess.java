import java.util.Scanner;

interface Payment {
    float processPayment(float currBalance);

    void generateReceipt();
}

interface Account {
    Scanner s = new Scanner(System.in);

    default float makePayment(float currBalance, String paymentType) {
        System.out.print("Enter amount you want to withdraw: ");
        float withdrawAmount = s.nextFloat();

        if (withdrawAmount <= currBalance) {
            currBalance -= withdrawAmount;
            System.out.println("Payment of " + withdrawAmount + " is done via " + paymentType);
            System.out.println("Remaining balance: " + currBalance);
            generateReceipt(withdrawAmount);
        } else {
            System.out.println("Error: Insufficient balance.");
        }
        return currBalance;
    }

    default void generateReceipt(float withdrawAmount) {
        System.out.println("Generating receipt for payment of: " + withdrawAmount);
    }
}

class CreditCardPayment implements Payment, Account {
    public float processPayment(float currBalance) {
        System.out.print("Enter your CVV: ");
        int cvv = s.nextInt();

        if (cvv == 123) {
            return makePayment(currBalance, "Credit Card");
        } else {
            System.out.println("Invalid CVV");
            return currBalance;
        }
    }

    public void generateReceipt() {
    }
}

class DebitCardPayment implements Payment, Account {
    public float processPayment(float currBalance) {
        System.out.print("Enter your PIN: ");
        int pin = s.nextInt();

        if (pin == 1234) {
            return makePayment(currBalance, "Debit Card");
        } else {
            System.out.println("Invalid PIN");
            return currBalance;
        }
    }

    public void generateReceipt() {
    }
}

class PhonePePayment implements Payment, Account {
    public float processPayment(float currBalance) {
        System.out.print("Enter your UPI PIN: ");
        int upiPin = s.nextInt();

        if (upiPin == 1234) {
            return makePayment(currBalance, "PhonePe");
        } else {
            System.out.println("Invalid UPI PIN");
            return currBalance;
        }
    }

    public void generateReceipt() {
    }
}

public class PaymentProcess {
    public static void main(String[] args) {
        int choice;
        float currBalance = 5000;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("\nMenu");
            System.out.println("1. Credit Card Payment");
            System.out.println("2. Debit Card Payment");
            System.out.println("3. PhonePe Payment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    currBalance = new CreditCardPayment().processPayment(currBalance);
                    break;
                case 2:
                    currBalance = new DebitCardPayment().processPayment(currBalance);
                    break;
                case 3:
                    currBalance = new PhonePePayment().processPayment(currBalance);
                    break;
                case 4:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
        s.close();
    }
}
