import java.util.Scanner;

public class subwooferVol
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		subwooferVol calcVol = new subwooferVol();
		
		System.out.println("Enter the height in inches:");
		double height = keyboard.nextDouble();
		
		System.out.println("Enter the length in inches:");
		double length = keyboard.nextDouble();
		
		System.out.println("Enter the width in inches:");
		double width = keyboard.nextDouble();
		
		System.out.printf("The volume of the subwoofer is %10.2f cubic feet.\n", calcVol.conversion(height, length, width));
		
	}
	
	public double conversion(double h, double l, double w)
	{
		return (h*l*w)/1728;
	}
}