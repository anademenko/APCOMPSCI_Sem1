public class GMC extends Car
{
	private double x, y;
	
	public GMC()
	{
		super();
		x = y = 0;
	}
	
	public GMC(double X, double Y)
	{
		x = X;
		y = Y;
	}
	
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	
	public int getID()
	{
		return super.getID();
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
	
}