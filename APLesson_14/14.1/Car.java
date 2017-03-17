public class Car implements Location
{
	double[] location;
	private int ID = (int)(Math.random() * 89999) + 100000;
	
	public Car()
	{
		location = new double[2];
	}
	
	public void move(double X, double Y)
	{
		location[0] += X;
		location[1] += Y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}