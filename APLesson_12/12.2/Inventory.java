public class Inventory
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public Inventory(String M, String N)
	{
		manufacturer = M;
		name = N;
		category = "N/A";
		UPC = (int)(Math.random() * 89999999) + 100000000;
	}
	
	public Inventory(String M, String N, String C, double P)
	{
		manufacturer = M;
		name = N;
		category = C;
		price = P;
		UPC = (int)(Math.random() * 89999999) + 100000000;
	}
	
	public String toString()
	{
		return "Inventory Info \nManufacturer: " + manufacturer + 
								"\nName: " + name + 
								"\nCategory: " + category + 
								"\nUPC: " + UPC + 
								"\nPrice: " + price;
	}
}