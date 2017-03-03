public class Toyota implements Location
{
	private double[] location;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String S) 
	{
		location = new double[2];
		String[] C = S.split(", ");
		location[0] = Double.parseDouble(C[0]);
		location[1] = Double.parseDouble(C[1]);
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