import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the variables
        String username = "user", password = "password";
        String userName, passWord, select;

        // Getting the username and password
        System.out.print("Username : ");
        userName = input.nextLine();
        System.out.print("Password : ");
        passWord = input.nextLine();

        // If-Else to control the information
        if (userName.equals(username) && passWord.equals(password)) {
            System.out.println("Login successful.");
        }
        // when wrong password is entered
        else if (userName.equals(username) && !passWord.equals(password)) {
            System.out.print("You entered the wrong password, would you like to change it? (Y/N): ");
            select = input.nextLine();

            if (select.equals("Y")) {
                System.out.print("New password : ");
                passWord = input.nextLine();

                // Checking the new password is equal to the previous password
                if (passWord.equals(password)) {
                    System.out.println("The new password is equal to the previous password, so could not create the password.");
                    System.out.println("Try logging in again with the password you entered.");
                } else {
                    System.out.println("The new password has been created.");
                }
            }else {
                System.out.println("Login information are wrong. Try again later.");
            }
        }
        // Wrong login information
        else {
            System.out.println("Login information are wrong. Try again later.");
        }


    }
}
