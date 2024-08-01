package pallavi;
import java.util.Scanner;
/*------ Defining a class for Circle ---------*/
class Circle
{
	/*---- Member variables -----*/
	private float radius,pie;
	/*-----------------------------------------*/
	/*--- Input of data through user ----*/
	public void inputSides()
	{
		/*--- creating object of scanner class -----*/
		Scanner sc=new Scanner(System.in);
		/*--- Input of data through keyboard -----*/
		System.out.print("Enter the radius : ");
		radius = sc.nextFloat();
		System.out.print("Enter pie value : ");
		pie = sc.nextFloat();
	}
	/*----------------------------------------------------------------------------------*/
	/*---- Method to Display data ------*/
	public void displaySides()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("----------- Rectangle -------");
		System.out.println("radius :"  + radius+ "in(cm)");
		System.out.println("pie : " +pie +"in cm");
	}
	/*---------------------------------------------------------------------------*/
	/*------ Method to calculate Perimeter --------*/
	public void calculatePerimeter()
	{
		float perimeter; // variable to store perimeter
		perimeter = 2 *pie*radius;
		System.out.println("Perimeter : "+perimeter+" cm");
	}
	/*------ Method to calculate area --------*/
	public void calculateArea()
	{
		float area; // variable to store area
		area = pie*radius*radius;
		System.out.println("Area : "+area+" sq. cm");
	}
}
/*--------------------------------- Initial Class --------------------------------------*/
public class CircleOperation {

	public static void main(String[] args) 
	{
		// Creating Object of Rectangle class
		Circle cirobj= new Circle();
		/*--- method for input of sides ----*/
		cirobj.inputSides();
		/*--- Method to display side of rectangle ----*/
		cirobj.displaySides();
		/*---- method of perimeter -----*/
		cirobj.calculatePerimeter();
		/*--- method of area -----*/
		cirobj.calculateArea();
	}
}
	
	
	


