public class Honda implements Location
{
	private double[] location;
	
	public Honda()
	{
		location = new double[2];
	}
	
	public Honda(double[] L)
	{
		location = new double[2];
		location[0] = L[0];
		location[1] = L[1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 89999) + 100000;
	}
	
	public void move(double X, double Y)
	{
		location[0] += X;
		location[1] += Y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
}