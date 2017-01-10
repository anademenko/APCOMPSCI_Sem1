import java.util.Scanner;

public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Please enter the x coordinate of the first point: ");
		int xOne = kb.nextInt();
		System.out.println("Please enter the y coordinate of the first point: ");
		int yOne = kb.nextInt();
		System.out.println("Please enter the x coordinate of the second point: ");
		int xTwo = kb.nextInt();
		System.out.println("Please enter the y coordinate of the second point: ");
		int yTwo = kb.nextInt();
	
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
	
		System.out.printf("First Point  = (%3d,%3d)", object.getX1(), object.getY1());
		System.out.printf("\nSecond Point = (%3d,%3d)", object.getX2(), object.getY2());
		System.out.printf("\nDistance = %4.2f", object.getDistance(xOne, yOne, xTwo, yTwo));
	
		object.setDistance(1, 2, 3, 4);
		
		System.out.printf("\nFirst Point  = (%3d,%3d)", object.getX1(), object.getY1());
		System.out.printf("\nSecond Point = (%3d,%3d)", object.getX2(), object.getY2());
		System.out.printf("\nDistance = %4.2f", object.getDistance(xOne, yOne, xTwo, yTwo));
	}
}
