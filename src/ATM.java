import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password;
        int right = 3, balance = 0, select, price;
        while (right > 0){
            System.out.print("Enter the username : ");
            username = sc.nextLine();
            System.out.print("Enter the password : ");
            password = sc.nextLine();

            if (username.equals("user") && password.equals("password")) {
                System.out.println("Hello, welcome to the Bank ...!");

                do {
                    System.out.print("1. Deposit\n" +
                                     "2. Withdraw\n" +
                                     "3. Balance inquiry\n" +
                                     "4. Log out\n");
                    System.out.print("Please select the action you want to do : ");
                    select = sc.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("How much money do you want to deposit : ");
                            price = sc.nextInt();

                            balance += price;

                            System.out.println("You have " + balance + " TL in your bank account now.\n");
                            break;
                        case 2:
                            System.out.print("How much money do you want to withdraw : ");
                            price = sc.nextInt();

                            if (price > balance) {
                                System.out.println("You cannot withdraw that much money from your bank account.");
                            } else {
                                balance -= price;
                                System.out.println("You have " + balance + " TL in your bank account now.\n");
                            }
                            break;
                        case 3:
                            System.out.println("You have " + balance + " TL in your bank account.\n");
                            break;
                    }
                } while (select != 4);

                System.out.println("You logged out. We hope you come again.");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.print("You do not have any right to log in. Please call the call center.");
                } else {
                    System.out.println("You have " + right + " right to log in.");
                }
            }
        }
    }
}
