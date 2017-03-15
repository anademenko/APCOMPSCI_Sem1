public abstract class Car implements Location
{
	private double[] location;
	private int ID = (int)(Math.random() * 89999) + 100000;
	
	public Car()
	{
		location = new double[2];
	}
	
	public abstract void move(double X, double Y);
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
}