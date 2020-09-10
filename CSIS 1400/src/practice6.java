public class practice6
{
	public static void main(String[] args)
	{
		int t = 0;
		int[][] x = new int[][] {
			{2,2,2,2,2},
			{2,2,2,2,2},
			{2,2,2,2,2},
			{2,2,2,2,2},
			{2,2,2,2,2},
		};
				
		for (int i =0; i <x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				t=t+x[i][j];
			
			}
		}
		System.out.println(t);
	}
}