import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the starting number: ");
		int start = kb.nextInt();
		
		System.out.println("Please enter the sequence size: ");
		int[] seq = new int[kb.nextInt()];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0)
			{
				seq[i] = start;
			}
			else if(i == 1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i - 1] + seq[i - 2];
			}
			System.out.print(seq[i] + " ");
		}
	}
}
