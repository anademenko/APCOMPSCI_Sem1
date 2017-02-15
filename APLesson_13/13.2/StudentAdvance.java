public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int n)
	{
		super(n);
	}
	
	public double getPrice()
	{
		if(getDaysLeft() >= 10)
		{
			return 15.00;
		}
		else
		{
			return 20.00;
		}
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + 
				"\nPrice: $" + getPrice() + 
				"\n(STUDENT ID REQUIRED)";
	}
}