import java.util.Arrays;
import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
		
	public ToyStore(String list)
	{
		loadToys(list);
	}
		
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		String[] t = ts.split(", ");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(t));
			
		for(int i = 0; i < toys.size(); i+=2) 
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy T = getThatToy(name);
				
			if(T == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				T.setCount(1 + T.getCount());
			}
		}
	}
		
	public Toy getThatToy(String nm)
	{
		for(Toy x: toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
		return null; 
	}
		
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
			
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
		
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
			
		for(Toy x: toyList)
		{
			if(x.getType().equals("Car"))
			{
				cars++;
			}
			if(x.getType().equals("Action Figure"))
			{
				figures++;
			}
		}
			
		if(cars > figures)
		{
			return "Cars";
		}
			
		if(figures > cars)
		{
			return "Action Figures";
		}
			
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
		
	public String toString()
	{
		String output = "";
		for(Toy x: toyList)
		{
			output += "" + x + " ";
		}
		return output;
	}
}