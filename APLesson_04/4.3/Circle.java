import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the circle radius:");
		double r = kb.nextDouble();
		
		print(r, calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return(r*r)*3.14;
	}
	
	public static void print(double r, double area)
	{
		System.out.println("The area of a circle whose radius is " + r + " units long is " + area + " units cubed.");
	}
}
