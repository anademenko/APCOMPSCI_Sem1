import java.util.Scanner;
public class Exercise_02
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
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
		
		System.out.println("Please enter item 4:");
		keyboard.nextLine();
		String item4 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price4 = keyboard.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = discount(subtotal);
		double tax = (subtotal - discount) * .08;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.println("");
		format("Subtotal:", subtotal);
		format("Discount:", discount);
		format("Tax:", tax);
		format("Total:", total);
		System.out.println("\n-----------------------------------");
		System.out.println("* Thank you for your support. *");
	}
	
	public static double discount(double subtotal)
	{
		double discount = 0;
		
		if(subtotal >= 2000)
		{
			discount = subtotal * .15;
		}
		
		if(subtotal < 2000)
		{
			discount = 0;
		}
		
		return discount;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n* %15s ..... %10.2f", item, price);
	}
}