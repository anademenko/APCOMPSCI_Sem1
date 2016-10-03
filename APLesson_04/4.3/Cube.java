import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the cube side length:");
		double side = kb.nextDouble();
		
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double s)
	{
		return(s*s)*6;
	}
	
	public static void print(double s, double sa)
	{
		System.out.println("The surface area of a cube whose sides are " + s + " units long is " + sa + " cube units.");
	}
}
