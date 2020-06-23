/*
																			Header
		Program #2
		Programmed By: Garrett Jones, student (August/24/2019)
		
		Goal:
		
			Write an applicatio0n that solicits and inputs three integers from the user and then displays the sum, average, product, smallest, and largest of the three numbers.  You may use Java input and output method you want, for example the JOptionPane class or the Scanner class.
		
		Specifications:
		 	*only interger arithmetic for calculations.
		 	*Numbers to be used: 7, 3, 5 in this order.  Must accept accept   any 3 integer's, but these numbers must be used.
		
		
		
		
		
		*/

import java.util.Scanner;
public class HelloWorld 
{

	public static void main(String[] args) 
	{
		
		Scanner inputDevice = new Scanner(System.in); //Creates a scanner object and assigns it to the default input device (Keyboard)
								//** The keyword "new" is required by Java and used whenever creating objects more complex than the primitive data types.
		int a, b ,c;
		
		
		System.out.print("              Basic Arithmetic Calculator\n\n");
		System.out.print("This program will display the sum, average, product, smallest, and largest of any three numbers entered.\n");
		System.out.print("\nPlease enter three numbers to receive the calculation: ");
		
		System.out.print("\nNumber One >> ");
			a = inputDevice.nextInt(); // assigning variable to the created scanner object, which collects input.
		
		System.out.print("\nNumber Two >> ");
			b = inputDevice.nextInt(); // assigning.
		
		System.out.print("\nNumber Three >> ");
			c = inputDevice.nextInt(); // assigning.
		
		System.out.print("The three numbers entered are " + a + ", " + b + ", and " + c + "."); // confirming correct input.
		
		//----------Arithmetic equations---------------
		System.out.println("\nSum: " + (a+b+c) + "\nAverage: " + ((a+b+c)/3)+ "\nProduct: " + (a*b*c));
		
		
		//----------Find largest number-----------
		if(a > b && a > c)
		{
			System.out.print("\nLargest Number: " + a);
		}
		else if (b > a && b > c)
		{
			System.out.print("\nLargest Number: " + b);
		}
		else
		{
			System.out.print("\nLargest Number: " + c);
		}
		
		
		//-------Find smallest number----------
		if(a < b && a < c)
		{
			System.out.print("\nSmallest Number: " + a);
		}
		else if(b < a && b < c)
		{
			System.out.print("\nSmallest Number: " + b);
		}
		else
		{
			System.out.print("\nSmallest Number: " + a);
		}
		
	}

}
