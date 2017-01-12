import java.util.Scanner;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your hair color: ");
		String hair = kb.nextLine();
		System.out.println("Please enter your eye color: ");
		String eyes = kb.nextLine();
		System.out.println("Please enter your skin color: ");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println("My Information... ");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		object.setHES("black", "brown", "white");
		System.out.println("");
		System.out.println("Amy's Information... ");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
	}
}