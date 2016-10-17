import java.util.Scanner;

public class GPA_calc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your letter grade in Math: ");
		String grade1 = kb.next();
		
		System.out.println("Enter your letter grade in English: ");
		String grade2 = kb.next();
		
		System.out.println("Enter your letter grade in Biology: ");
		String grade3 = kb.next();
		
		System.out.println("Enter your letter grade in Physical Education: ");
		String grade4 = kb.next();
		
		System.out.println("Enter your letter grade in Journalism: ");
		String grade5 = kb.next();
		
		System.out.println("Enter your letter grade in Spanish: ");
		String grade6 = kb.next();
		
		System.out.println("Enter your letter grade in Art: ");
		String grade7 = kb.next();
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		
		System.out.println("Your GPA is " + gPoints/7 + ".");
	}
	
	public static double calcPoints(String grade)
	{
		double points = 0;
	
		if(grade.equals("A"))
			points = 4.0;
		else if(grade.equals("B"))
			points = 3.0;
		else if(grade.equals("C"))
			points = 2.0;
		else if (grade.equals("D"))
			points = 1.0;
		else
			points = 0.0;
		
		return points;
	}
}