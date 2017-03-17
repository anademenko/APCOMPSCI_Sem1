public class Toyota extends Car
{
	public Toyota(String S) 
	{
		super();
		String[] C = S.split(", ");
		location[0] = Double.parseDouble(C[0]);
		location[1] = Double.parseDouble(C[1]);
	}
}