//Derek Memmott
import java.util.Scanner;
import java.util.Random;
public class Derek_Memmott_Week6Assignment
{
	public static void main(String[] args)
	{
		//Part one
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int min;
		int max;
		int sum = 0;
		int amount;
		int randomNumber;
		
		System.out.println("Part 1: for loop: Average of randomly generated integers");
		System.out.println("------------------------------------------------------");
		System.out.println("---------------");
		System.out.print("Enter the bottom number of the range: ");
		min = input.nextInt();
		System.out.print("Enter the top number of the range: ");
		max = input.nextInt();
		System.out.print("Enter How Many Numbers to Generate: ");
		amount = input.nextInt();
		System.out.print("Generated Random Numbers: ");
		
		for(int i = 1; i<=amount; i++)
		{
			randomNumber = rand.nextInt((max - min) + 1) + min;
		System.out.print(randomNumber + " ");
		sum = sum + randomNumber;
		}
		System.out.println("\nAverage of generated numbers: " + sum/amount);
		System.out.println("------------------------------------------------------");
		System.out.println("---------------");
		
		//Part two

			int myNum;
			int sum1 = 0;
			int counter = 0; 
				
			System.out.println("Enter integers to average. Enter -1 to finish.");
			System.out.print("First Entry: ");
			myNum=input.nextInt();
			while (myNum != -1)
			{
				sum1 = sum1 + myNum;
				counter++;
				System.out.print("Next Entry:");
				myNum = input.nextInt();
					
			}
			System.out.println("\nNumber of entries: " + counter + " with a sum of: " + sum1);
			System.out.println("Average of user-entered numbers: " + (sum1/counter));
			System.out.println("------------------------------------------------------");
			System.out.println("---------------");
			input.close();
			
			//Part three
			
	}
}