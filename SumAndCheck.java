package pallavi;
import java.util.Scanner;
public class SumAndCheck {
  // Method to calculate the sum of two numbers
	    public static int calculateSum(int num1, int num2) {
	        return num1 + num2;
	    }

	    // Method to check if a number is positive
	    public static boolean isPositive(int result) {
	        return result > 0;
	    }

	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // taking input from keyboard
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Calculate the sum using the calculateSum method
	        int sum = calculateSum(num1, num2);

	        // Check if the sum is positive using the isPositive method
	        boolean resultPositive = isPositive(sum);

	        // Display the results
	        System.out.println("Sum: " + sum);
	        if (resultPositive) {
	            System.out.println("The sum is positive.");
	        } else {
	            System.out.println("The sum is not positive.");
	        }

	        
	    }
	}
	


