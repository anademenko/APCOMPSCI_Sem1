import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression: ");
		String initial_expression = kb.nextLine();
		
		ArrayList<String> expression = new ArrayList<>(Arrays.asList(initial_expression.split(" ")));
		System.out.println(doExpression(expression));
	}
	
	public static ArrayList<String> doExpression(ArrayList<String> expression)
	{
		int i = 0;
		while(i < expression.size())
		{
			if(expression.get(i).equals("*") || expression.get(i).equals("/"))
			{
				if(expression.get(i).equals("*"))
				{
					expression.set(i, "" + (Integer.parseInt(expression.get(i-1)) * Integer.parseInt(expression.get(i+1))));
				}
				else
				{
					expression.set(i, "" + (Integer.parseInt(expression.get(i-1)) / Integer.parseInt(expression.get(i+1))));
				}
				expression.remove(i-1);
				expression.remove(i);
			}
			else
				i++;
		}
		i = 0;
		while(i < expression.size())
		{
				if(expression.get(i).equals("+") || expression.get(i).equals("-"))
			{
				if(expression.get(i).equals("+"))
				{
					expression.set(i, "" + (Integer.parseInt(expression.get(i-1)) + Integer.parseInt(expression.get(i+1))));
				}
				else
				{
					expression.set(i, "" + (Integer.parseInt(expression.get(i-1)) - Integer.parseInt(expression.get(i+1))));
				}
				expression.remove(i-1);
				expression.remove(i);
			}
			else
				i++;
		}
		return expression;
	}
	
}