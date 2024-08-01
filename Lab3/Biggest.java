package Lab3;
//class declaration
import java.util.Scanner;
public class Biggest {
//main method
	public static void main(String[] args) {
		// creating a object for the scanner class
		Scanner sc = new Scanner(System.in);
		//initializing the variables
		int num1,num2,num3;
		//Taking variables from the user
		System.out.println("enter any Three numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		// condition
			if (num1>num2 && num1>num3) {
			System.out.println(num1  +"is greatest");
			}
		else if (num2>num1 && num2>num3) {
			System.out.println( num2  +"is greatest");
			}
		else  {
			System.out.println( num3 +"is greatest");
			}
		
		}
	

	}


