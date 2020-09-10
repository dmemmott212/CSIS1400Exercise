//Derek Memmott
public class VarDataTypeAssignment
{ 
    public static void main(String[] args) 
    {
    	String firstName = "Bob";
    	String lastName = "Smith";
    	int age = 20;
    	double gpa = 3.52;
    	String major = "Biology";
    	String Class = "Sophomore";
    	
    	System.out.print("===============================\n");
    	System.out.print("STUDENT REPORT\n");
        System.out.print("===============================\n");
        System.out.printf("Student Name:\t%s %s\n",  firstName, lastName);
        System.out.printf("Age: " + age + "\t\tGPA: %.2f\n", gpa);
        System.out.println("Major: " + major);
        System.out.println("Class: " + Class);
        System.out.println("===============================");
    }
}