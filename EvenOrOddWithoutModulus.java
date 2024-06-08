import java.util.Scanner;

public class EvenOrOddWithoutModulus {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Calculate the result of dividing the number by 2 and multiplying back
        int result = (number / 2) * 2;

        // Print whether the number is even or odd using a ternary operator
        System.out.println("The number is " + (number == result ? "even." : "odd."));

        // Close the scanner
        scanner.close();
    }
}
