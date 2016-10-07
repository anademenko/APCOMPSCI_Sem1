import java.util.Random;
public class Exercise_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		int PlayerRoll = rand.nextInt(6)+1;
		int CompRoll = rand.nextInt(6)+1;
		
		String winner = rollDice(PlayerRoll, CompRoll);
		
		System.out.println("You rolled a " + PlayerRoll + ".");
		System.out.println("Computer rolled a " + CompRoll + ".");
		System.out.println("The winner is " + winner + ".");
		
	}
	
	public static String rollDice(int p, int c)
	{
		String winner = "";
		
		if(p > c)
		{
		    winner = "you";
		}
		
		if(c > p)
		{
			winner = "computer";
		}
		
		return winner;
	}
}