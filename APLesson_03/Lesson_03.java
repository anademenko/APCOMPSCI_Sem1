import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay! " + teacher + " is very good!");
		
	}
}