import java.util.Scanner;

public class FactorialCalculator {
    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1; // Factorial of 0 is 1
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Main method
    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // Get user input
        long factorial = calculateFactorial(number); // Calculate factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // Display result
    }
}
Madelyn
Madelyn Musa Alimao
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            handleMenuChoice(choice, scanner);
        } while (choice != 3);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    public static void handleMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(scanner);
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}