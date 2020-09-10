//Derek Memmott
import java.util.Scanner;

public class Week4Assignment 
{ 
    public static void main(String[] args) 
    {
    	double Length;
    	double Width;
    	double Height;
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("This is a program that will calculate the volume and surface area of a box, by entering the length, width, and height of the box.");
    	System.out.print("\nEnter the box length: ");
    	Length = input.nextDouble();
    	System.out.print("Enter the box height: ");
    	Height = input.nextDouble();
    	System.out.print("Enter the box width: ");
    	Width = input.nextDouble();
    	System.out.printf("\nThe volume of your box is: %,.2f%n", (Length * Width * Height));
    	System.out.printf("The surface area of your box is: %,.2f%n", (2 * Length * Width) + (2 * Length * Height) + (2 * Height * Width));
    	input.close();
    	
    	
    }
}