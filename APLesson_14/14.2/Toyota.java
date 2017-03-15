public class Toyota extends Car
{
	private double[] location;
	
	public Toyota()
	{
		super();
	}
	
	public Toyota(String S) 
	{
		location = new double[2];
		String[] C = S.split(", ");
		location[0] = Double.parseDouble(C[0]);
		location[1] = Double.parseDouble(C[1]);
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