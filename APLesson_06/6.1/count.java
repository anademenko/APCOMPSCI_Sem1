import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer to count up to: ");
		int num1 = kb.nextInt();
		
		System.out.println("Please enter another integer to count by: ");
		int num2 = kb.nextInt();
		
		for(int i = num2; i <= num1; i += num2)
		{
			System.out.print(i + " ");
		}
	}
}