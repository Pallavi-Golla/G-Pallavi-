package Lab3;
import java.util.Scanner;
public class SelectOption {
	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//creating two variables to store data
		int num1,num2;
		int choice;
		System.out.println("enter first number :");
		num1=sc.nextInt();
		System.out.println("enter second number :");
		num2=sc.nextInt();
	// displaying menu of operation to the user
		System.out.println("..........Numeric Caluclation....... ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.product");
		System.out.println("4.Division");
		// Asking user to select any one operation......//
		System.out.println("select any operation :");
		int operation=sc.nextInt();
		// performing the operation as per selection
		switch(operation)
		{
		case 1:System.out.println("Sum of "+num1+" and "+num2+" is :"+(num1+num2));
		break;
		case 2:System.out.println("Difference of "+num1+" and "+num2+" is :"+(num1-num2));
		break;
		case 3:System.out.println("Product of "+num1+" and "+num2+" is :"+(num1*num2));
		break;
		case 4:System.out.println("Division of "+num1+" and "+num2+" is :"+(num1%num2));
		break;
		default:System.out.println("invalid operation");
		System.out.println("press 0 to exit or anyother number to continue");
		choice=sc.nextInt();
		while(choice!=0);
	}
	}
}




		
		
		
		
		
				

		
		
		
	
	
	
	


