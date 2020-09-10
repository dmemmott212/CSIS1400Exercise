import java.util.Random;
import java.util.Scanner;
public class Practice3
{ 
    public static void main(String[] args) 
    {
    	int min;
    	int max;
    	int x;
    	Random rand = new Random();
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a minimum integer: ");
    	min = input.nextInt();
    	System.out.println ("Enter a maximum integer: ");
    	max = input.nextInt();
    	
    	if(min < max)
    	{
    	System.out.println("Random number between " + min + " and " + max +": " + (rand.nextInt((max - min) + 1) + min));
    	}
    	else
    	{
    		System.out.println("Error: Your minimum value must be less than your maximum value.\n" + "Please try again.");
    	}
    }
}