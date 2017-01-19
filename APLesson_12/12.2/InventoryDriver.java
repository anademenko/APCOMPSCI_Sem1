import java.util.Scanner;

public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the manufacturer: ");
		String manufacturer = kb.nextLine();
		System.out.println("Please enter the item name: ");
		String name = kb.nextLine();
		System.out.println("Would you like to enter the item category and price? (y or n)");
		String response = kb.nextLine();
		
		if(response.equals("n"))
		{
			Inventory object = new Inventory(manufacturer, name);
			System.out.println(object);
		}
		
		if(response.equals("y"))
		{
			System.out.println("Please enter the item category: ");
			String category = kb.nextLine();
			System.out.println("Please enter the item price: ");
			double price = kb.nextDouble();
			Inventory object = new Inventory(manufacturer, name, category, price);
			System.out.println(object);
		}
	}
}