import java.util.Scanner;
public class underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your sentence: ");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ") < 0) 
			return sentence;
		else
		{
			while(sentence.indexOf(" ") >= 0)
			{
				sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
			}
			return replace(sentence);
		}
	}
}