import java.util.Scanner;

public class CompSciFinal
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Would you like to select a major or enter courses?" + 
							" \nM  = Select a Major" + 
							"\nC = Enter Courses");
		String response = kb.nextLine();
		
		if(response.equals("M"))
		{
			ChooseMajor.main(new String[0]);
		}
		
		if(response.equals("C"))
		{
			ChooseCourses.main(new String[0]);
		}
	}
}