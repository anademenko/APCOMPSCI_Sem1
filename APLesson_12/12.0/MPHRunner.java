import java.util.Scanner;

public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the distance in miles: ");
		int distance = kb.nextInt();
		
		System.out.println("Please enter the hours: ");
		int hours = kb.nextInt();
		
		System.out.println("Please enter the minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hour(s) and " + object.getMinutes() + " minutes = " + object.getMilesPerHour(distance, hours, minutes) + " mph");
		
		object.setMilesPerHour(12, 1, 30);
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hour(s) and " + object.getMinutes() + " minutes = " + object.getMilesPerHour(12, 1, 30) + " mph");
	}
}