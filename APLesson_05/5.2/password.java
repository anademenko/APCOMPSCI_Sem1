import java.util.Scanner;
public class password
{
	static String username;
	static String password;
	
	public static void main(String[]args)
	{
		username = "PatrickStar";
		password = "icantseemyforehead";
		
		passCheck();
	}
	
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String u = kb.nextLine();
		
		System.out.println("Enter your password: ");
		String p = kb.nextLine(); 
		
		if(username.equals(u) && password.equals(p))
		{
			System.out.println("You are granted access!");
		}
		
		else if (username.equals(u))
		{
			System.out.println("Your password is incorrect!");
			passCheck();
		}
		
		else if (password.equals(p))
		{
			System.out.println("Your username is incorrect!");
			passCheck();
		}
		
		else
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}