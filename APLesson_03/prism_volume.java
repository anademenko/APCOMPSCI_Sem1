import java.util.Scanner; 

public class prism_volume
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hey there! I see you want to find the volume of your rectangular prism.");
		
		System.out.println("What is the length of the rectangular prism?");
		
		double length = keyboard.nextDouble();
		
		System.out.println("Okay! What is the width of the rectangular prism?");
		
		double width = keyboard.nextDouble();
		
		System.out.println("Great! What is the height of the rectangular prism?");
		
		double height = keyboard.nextDouble();
		
		double volume = length * width * height;
		
		System.out.println("The volume of your rectangular prism is " + volume);
		
	}
}