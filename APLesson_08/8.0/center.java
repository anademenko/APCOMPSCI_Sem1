import java.util.Scanner;
public class center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first word: ");
		String one = kb.next();
		
		System.out.println("Please enter the second word: ");
		String two = kb.next();
		
		System.out.println("Please enter the third word: ");
		String three = kb.next();
		
		System.out.println(makeCenter(one));
		System.out.println(makeCenter(two));
		System.out.println(makeCenter(three));
	}
	
	public static String makeCenter(String word)
	{
		if(word.length() >= 20) 
			return word;
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
}