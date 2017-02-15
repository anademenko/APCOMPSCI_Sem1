public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		this.serialNo = (int)(Math.random() * 899999) + 1000000;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + 
				"\nPrice: $" + getPrice() + "\n";
	}
}