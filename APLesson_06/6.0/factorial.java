import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int num = kb.nextInt();
		int factorial = 1;
		
		for(int i = 1; i <= num; i++)
		{
			factorial = i * factorial;
		}
		
		System.out.println(factorial);
	}
}