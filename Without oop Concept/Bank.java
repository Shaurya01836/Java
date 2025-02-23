import java.util.Scanner;

class Bank {
	public static void main(String[] args) {
		float balance = 0, depositAmount = 0, withdrawAmount = 0;
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.print("Are you a New Customer if yes(1)or no(0):");
		choice = s.nextInt();
		if (choice == 1) {
			System.out.println("We can create a new account for you");
			System.out.print("Do you want to deposit any amount if yes(1) or no(0):");
			choice = s.nextInt();
			if (choice == 1) {
				System.out.print("Enter the amount you want to deposit :");
				depositAmount = s.nextInt();
				balance += depositAmount;
			} else {
				System.out.print("We have sucessfully created your account with 0 balance");
			}
		}
		do {
			System.out.println("Menu");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice :");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter the amount you want to deposit :");
					depositAmount = s.nextFloat();
					balance += depositAmount;
					break;
				case 2:
					System.out.print("Enter the amount you want to Withdraw :");
					withdrawAmount = s.nextFloat();
					if (withdrawAmount > balance)
						System.out.println("Can not withdraw amount more than the balance");
					else
						balance -= withdrawAmount;
					break;
				case 3:
					System.out.println("Your Balance is : " + balance);
					break;
				case 4:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}

		} while (choice != 4);

		s.close();

	}

}