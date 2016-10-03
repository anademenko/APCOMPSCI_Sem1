import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the rectangle length:");
		double length = kb.nextDouble();
		
		System.out.println("Please enter the rectangle width:");
		double width = kb.nextDouble();
		
		print(calcPerim(length,width));
	}
	
	public static double calcPerim(double l, double w)
	{
		return(2*l)+(2*w);
	}
	
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}
