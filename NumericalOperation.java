package SelectionStatements;
import java.util.Scanner;
public class NumericalOperation {
   public static void main(String[] args) {
	   //creating object of scanner class
	   Scanner sc =new Scanner(System.in);
	   //....creating variables to store two numbers
	   int num1,num2;
	 //....input of data through keyboard
	   System.out.println("enter first number:");
	   num1= sc.nextInt();
	   System.out.println("enter second number:");
	   num2=sc.nextInt();
	   //...............................................................................*/
	   System.out.println("..........................................................................." );
	   System.out.println(".......... Operations.................." );
	   System.out.println("Addition");
	   System.out.println("subtraction");
	   System.out.println("product");
	   System.out.println("........ ................................");
	   //....Asking the user to select any one operation.....
	   System.out.println("select any one operation :");
	   int operation = sc.nextInt();
	   //...............................................................................//
	   switch(operation)
	   {
	   case 1:
		   System.out.println("sum of " + num1+" and "+num2+" is : "+(num1+num2)) ;
	   break;
	   case 2:System.out.println("difference between " + num1+" and "+num2+" is : "+(num1+num2)) ;
	   break;
	   case 3:System.out.println("product between " + num1+" and "+num2+" is : "+(num1+num2)) ;
	   break;
	   default :System.out.println(" Invalid operation");
	   }
   }
}
	   
	   
	   
	   

	   
	   
	   
	   
	   
	   
			   
		

	


