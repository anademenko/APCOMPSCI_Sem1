public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket object1 = new Walkup();
		Ticket object2 = new Advance(14);
		Ticket object3 = new StudentAdvance(5);
		
		System.out.println("*****Receipt*****");
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		double total = object1.getPrice() + object2.getPrice() + object3.getPrice();
		System.out.println("\nTotal: $" + total);
	}
}