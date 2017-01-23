import java.util.Scanner;

public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = kb.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = kb.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String response = kb.nextLine();
		
		if(response.equals("n"))
		{
			User user1 = new User(firstName, lastName);
			System.out.println(user1);
		}
		
		if(response.equals("y"))
		{
			System.out.println("Please enter an avatar: ");
			String avatar = kb.nextLine();
			User user1 = new User(firstName, lastName, avatar);
			System.out.println(user1);
		}
	}
}