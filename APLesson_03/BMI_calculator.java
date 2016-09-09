import java.util.Scanner; 

public class BMI_calculator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello! What is your weight in pounds?");
		
		double weight = keyboard.nextDouble();
		
		System.out.println("Okay! What is your height in inches?");
		
		double height = keyboard.nextDouble();
		
		double BMI = 703 * weight / (height * height);
		
		System.out.println("Alright! According to my calculations, your BMI is " + BMI + ".");
		
		
	}
}