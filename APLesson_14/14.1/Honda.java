public class Honda extends Car
{
	private double[] location;
	
	public Honda()
	{
		super();
	}
	
	public Honda(double[] L)
	{
		location = new double[2];
		location[0] = L[0];
		location[1] = L[1];
	}
	
	public void move(double X, double Y)
	{
		location[0] += X;
		location[1] += Y;
	}
	
	public int getID()
	{
		return super.getID();
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
}