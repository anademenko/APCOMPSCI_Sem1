import java.util.Scanner;

public class BMI_calc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches: ");
		double height = kb.nextDouble();
		
		System.out.println("Enter weight in pounds: ");
		double weight = kb.nextDouble();
		
		double bmi = 703 * weight / (height * height);
		String condition = calcCondish(bmi);
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("You are " + condition + ".");
	}
	
	public static String calcCondish(double bmi)
	{
		String condition = "";
		
		if(bmi < 18.5)
			condition = "Underweight";
		else if(bmi < 24.9)
			condition = "Normal";
		else if(bmi < 29.9)
			condition = "Overweight";
		else if(bmi < 34.9)
			condition = "Obese";
		else if (bmi < 39.9)
			condition = "Very Obese";
		else if (bmi > 39.9)
			condition = "Morbidly Obese";
		
		return condition;
	}
}