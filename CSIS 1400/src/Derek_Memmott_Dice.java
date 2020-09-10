//Derek Memmott;
import java.util.Scanner;
import java.util.Random;


public class Derek_Memmott_Dice
{ 
    public static void main(String[] args) 
    {
    	displayMenu();
    	Scanner input = new Scanner(System.in);
    	int choice;
    	choice = input.nextInt();
    	if ((choice==4)||(choice==6)||(choice==8)||(choice==10)||(choice==12)||(choice==20))
    	{
    		rollDice();
    	}
    	else
    		displayError();
    	}
    


    
    private static void rollDice()
    {
    	Scanner input = new Scanner(System.in);
    	int choice;
    	choice = input.nextInt();
    	int die4;
    	int die6;
    	int die8;
    	int die10;
    	int die12;
    	int die20;
    	
    	die4 = (int)(Math.random()*4+1);
    	die6 = (int)(Math.random()*6+1);
    	die8 = (int)(Math.random()*8+1);
    	die10 = (int)(Math.random()*10+1);
    	die12 = (int)(Math.random()*12+1);
    	die20 = (int)(Math.random()*20+1);
    	switch (choice)
    	{
    	case 4: choice = die4;
    	System.out.println("you rolled a 4 sided die and it rolled a: " + die4 );
    	break;
    	case 6: choice = die6;
    	System.out.println("you rolled a 6 sided die and it rolled a: " + die6);
    	break;
    	case 8: choice = die8;
    	System.out.println("you rolled a 8 sided die and it rolled a: " + die8);
    	break;
    	case 10: choice = die10;
    	System.out.println("you rolled a 10 sided die and it rolled a: " + die10);
    	break;
    	case 12: choice = die12;
    	System.out.println("you rolled a 12 sided die and it rolled a: " + die12);
    	break;
    	case 20: choice = die20;
    	System.out.println("you rolled a sided die and it rolled a: " + die20);
    	break;
    	default: displayError();
    	break;
    	}
    	input.close();
    }

    private static void displayError()
    {
    	System.out.println("Error: The number you entered is not valid, enter a valid choice.\n" + "Please try again.\n");
    }
    private static void displayMenu()
    	{
   		System.out.println("-------------------------");
    	System.out.println("Select a Dice Size");
    	System.out.println("-------------------------");
    	System.out.println("4-sided");
    	System.out.println("6-sided");
    	System.out.println("8-sided");
    	System.out.println("10-sided");
    	System.out.println("12-sided");
    	System.out.println("20-sided");
    	System.out.println("-------------------------");
    	System.out.print("Enter 4, 6, 8, 10, 12, 20: \r");
    	
    	
  
 
    }
}