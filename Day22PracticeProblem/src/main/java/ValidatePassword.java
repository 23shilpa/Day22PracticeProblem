import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a valid password (minimum 8 characters): ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Valid password: " + password);
                break;
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if the password has a minimum of 8 characters
        return password.length() >= 8;
    }
}