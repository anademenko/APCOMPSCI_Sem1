import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your word: ");
		String word = kb.next();
		int stop = word.length();
		int start = 0;
		
		tree(word, start, stop);
	}
	
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("\n%15s", word.substring(0, start));
			start++;
			tree(word, start, stop);
		}
	}
}