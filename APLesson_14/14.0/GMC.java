public class GMC implements Location
{
	private double x, y;
	
	public GMC()
	{
		x = y = 0;
	}
	
	public GMC(double X, double Y)
	{
		x = X;
		y = Y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 89999) + 100000;
	}
	
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
	
}