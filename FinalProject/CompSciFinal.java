import java.util.Scanner;
public class CompSciFinal
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\nAvailable majors include: \n\tAccounting" + 
													"\n\tAdvertising and Marketing" + 
													"\n\tAnimation" + 
													"\n\tApplied Mathematics" + 
													"\n\tBiology" + 
													"\n\tBiomathematics" +
													"\n\tBiomedical Engineering" + 
													"\n\tBusiness Administration" +
													"\n\tChemistry" +
													"\n\tComputer Science" +
													"\n\tComputer Programming" +
													"\n\tCriminal Justice" +
													"\n\tEconomics" +
													"\n\tElectrical Engineering" +
													"\n\tEnglish" +
													"\n\tEnvironmental Science" +
													"\n\tGame Design" +
													"\n\tHistory" +
													"\n\tJournalism" +
													"\n\tMechanical Engineering" +
													"\n\tPhotography" +
													"\n\tPhysics" +
													"\n\tPolitical Science" +
													"\n\tPsychology" +
													"\n\tStatistics" +
													"\n\tTheatre");
		System.out.println("Please pick a major (input exactly as above): ");
		String major = kb.nextLine();
		
		Sorting object = new Sorting(major);
		System.out.println(object);
	}
}
