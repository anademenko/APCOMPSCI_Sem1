import java.util.Scanner;

public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the list of toys ...");
		
		ToyStore object = new ToyStore(kb.nextLine()); 
		System.out.println(object);
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + object.getMostFrequentType());
	}
}