import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		receipt form = new receipt();
		
		
		System.out.println("Please enter item 1:");
		
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		double price1 = keyboard.nextDouble();
		
		
		
		System.out.println("Please enter item 2:");
		
		keyboard.nextLine();
		
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		double price2 = keyboard.nextDouble();
		
		
		
		System.out.println("Please enter item 3:");
		
		keyboard.nextLine();
		
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		
		double price3 = keyboard.nextDouble();
		
			
		double subtotal_price = price1 + price2 + price3;
		
		double tax_price = 0.08 * subtotal_price;
		
		double total_price = tax_price + subtotal_price;
		
		
		System.out.println("<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		
		form.format(item2, price2);
		
		form.format(item3, price3);
		
		System.out.println();
		
		form.format("Subtotal", subtotal_price);
		
		form.format("Tax", tax_price);
		
		form.format("Total", total_price);
		
		System.out.println("\n---------------------------------------");
		
		System.out.println("* Thank you for your support. *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n* %15s ..... %15.2f", item, price);
	}
}