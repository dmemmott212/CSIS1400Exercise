import java.util.Scanner;

//Derek Memmott

public class Derek_Memmott_Week6Assignment2
{
	public static void main(String[] args)
	{
		//Part three
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int choice;
		do
		{
			displayMenu();
			choice = input.nextInt();
			switch (choice)
			{
			case 1:
				displayMenu();
				break;
			case 2:
				displayMenu();
				break;
			case 3:
				displayMenu();
				break;
			case 4:
				quit=true;
				break;
				default:
					System.out.println("Invalid Choice.");
			}
			System.out.print("\n");
		} while (!quit);
		System.out.println("Goodbye");
		input.close();
		}
		

	private static void displayMenu() 
	{
		System.out.println("==============================");
		System.out.println("MENU");
		System.out.println("==============================");
		System.out.println("1: Choice 1");
		System.out.println("2: Choice 2");
		System.out.println("3: Choice 3");
		System.out.println("==============================");
		System.out.println("Enter 1, 2, 3 or 4 to Exit: ");

		
	}
}