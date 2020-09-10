public class Practice
{ 
    public static void main(String[] args) 
    {
    	String string1, string2;
    	String checkLetter = "o";
    	string1 = "Introduction to ";
    	string2 = "Computer Programming";
    	System.out.println(string1.concat(string2));
    	System.out.printf("string1: %s [Length: %d]%n", string1, string1.length());
    	System.out.printf("string2: %s [Length: %d]%n", string2, string2.length());
    	System.out.printf("string2 contains out check letter (%s)? %b%n", checkLetter, string2.contains(checkLetter));
    	string2 = string2.replaceAll(checkLetter, "@");
    	System.out.printf("string2: %s.%n", string2);
    	string2 = string2.replaceAll("[AEIOUaeiou]", "*");
    	System.out.printf("string2: %s.%n", string2);
    	string2 = string2.replaceAll("[MRmr]", "%");
    	System.out.printf("string2: , %s.%n", string2);
    	System.out.printf("%s%s.%n", string1.toUpperCase(), string2.toUpperCase());
    	
    	
    	
    	
    	
    	
    	
    	
    }
}