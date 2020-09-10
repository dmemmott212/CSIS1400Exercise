/*Derek Memmott
 * This program will calculate the total season score and average of football teams based on the users input.
 */
import java.util.Scanner;
import java.util.Random;
public class Derek_Memmott_Week7Assignment
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int rows = 0;
		int cols = 0;
		int min = 1;
		int max = 30;
		int rowTotal = 0;
		int rowAverage = 0;
		int topTeam = 0;

		System.out.println("-------------------------------------------------------------");
		System.out.println("----");
		System.out.println("Football Team Randomized Season Scores");
		System.out.println("-------------------------------------------------------------");
		System.out.println("----");
		System.out.print("Enter the number of teams: ");
		rows = input.nextInt();
		System.out.print("Enter the number of games: ");
		cols = input.nextInt();
		input.close();
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("----");
		System.out.println("Football Scores Report");
		System.out.println("-------------------------------------------------------------");
		System.out.println("----\n");
		System.out.println("Team\tScores\t\t\t\t\t\tTot\tAvg");
		System.out.println("-------------------------------------------------------------");
		System.out.println("----");
	
		int[][] x = new int[rows][cols];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				x[i][j] = rand.nextInt((max - min) + 1) + min;
			}
		}
		System.out.println();
		for (int i = 0; i < rows; i++)
		{
			
			System.out.print((i+1) + ":\t");
			for (int j = 0; j < cols; j++)
			{
				System.out.print(x[i][j] + "\t");
				rowTotal = rowTotal + x[i][j];
				rowAverage = rowTotal/x[i].length;
				if (rowTotal > topTeam)
				topTeam = i+1;

			}
			System.out.print("\t" + rowTotal + "\t" + rowAverage);
			System.out.println();
			
		}

		System.out.println("-------------------------------------------------------------");
		System.out.println("----\n");
		System.out.println("Top Team: " + topTeam);
		System.out.println("-------------------------------------------------------------");
		System.out.println("----");
	}

}