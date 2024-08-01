package Lab3;
import java.util.Scanner;
public class NumberPattern {
		 public static void main(String[] args) {
		        // Create a Scanner object to read input from the user
		        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the number of rows
		        System.out.print("Enter the number of rows: ");
		        int rows = sc.nextInt();
		        // Generate and display the pattern
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            // Move to the next line after each row
		            System.out.println();
		        }
		 }          
}
