import java.util.Scanner;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your paint selection: ");
		String paint = kb.nextLine();
		System.out.println("Please enter your interior selection: ");
		String interior = kb.nextLine();
		System.out.println("Please enter your engine selection: ");
		String engine = kb.nextLine();
		System.out.println("Please enter your tire selection: ");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready... ");
		System.out.println("Paint: " + object.getPaint());
		System.out.println("Interior: " + object.getInterior());
		System.out.println("Engine: " + object.getEngine());
		System.out.println("Tires: " + object.getTires());
		
	}
}