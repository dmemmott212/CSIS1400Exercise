import java.util.Arrays;
import java.util.Scanner;
public class practice5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char[] alph = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		char char2Find;
		System.out.println("Enter one letter of the alphabet: ");
		char2Find = input.next().charAt(0);
		System.out.println("Full Array: " + Arrays.toString(alph));
		 System.out.println("The position of '" + char2Find + 
                 "' in the array is " + 
                 Arrays.binarySearch(alph, char2Find));
		 input.close();
	}
}