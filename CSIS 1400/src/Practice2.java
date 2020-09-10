public class Practice2
{ 
    public static void main(String[] args) 
    {
    	String firstName = "Derek";
    	String middleInitial = "T.";
    	String lastName = "Memmott";
    	String fullName;
    	if (middleInitial.length() ==0)
    	{
    		fullName = nameConcat(firstName, lastName);	
    	}
    	else
    	{
    		fullName = nameConcat(firstName, middleInitial, lastName);
    	}
    	System.out.println(fullName);
    }
    private static String nameConcat(String s1, String s2)
    {
    	return s2 +", " + s1;
    }
    private static String nameConcat(String s1, String s2, String s3)
    {
    	return s3 + ", " + s1 + " " + s2;
    }
}