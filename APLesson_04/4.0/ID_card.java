import java.util.Scanner;

public class ID_card
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		ID_card form = new ID_card();
		
		
		System.out.println("Enter your first name:");
		
		String first_name = keyboard.nextLine();
		
		
		System.out.println("Enter your last name:");
		
		String last_name = keyboard.nextLine();
		
		
		System.out.println("Enter your title:");
		
		String title = keyboard.nextLine();
		
		
		System.out.println("Enter the school site:");
		
		String school = keyboard.nextLine();
		
		
		System.out.println("Enter the school year:");
		
		String year = keyboard.nextLine();
		
		
		System.out.println("Enter the subject:");
		
		String subject = keyboard.nextLine();
		
		
		System.out.println("****************************************");
		
		form.format(school, year);
		
		System.out.println();
		
		form.format(first_name, last_name);
		
		System.out.println();
		
		form.format(title, subject);
		
		System.out.println("\n****************************************");
	}
	
	public void format(String column1, String column2)
	{
		System.out.printf("* %15s %20s *", column1, column2);
	}
}