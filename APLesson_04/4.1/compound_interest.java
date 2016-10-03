import java.util.Scanner;

public class compound_interest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		compound_interest loan = new compound_interest();
		
		System.out.println("Enter the interest rate:");
		double rate = keyboard.nextDouble();
		
		System.out.println("Enter the principal:");
		double principal = keyboard.nextDouble();
		
		System.out.println("Enter the number of times compounded per year:");
		double times_compounded = keyboard.nextDouble();
		
		System.out.println("Enter the life of the loan in years:");
		double time = keyboard.nextDouble();
		
		System.out.printf("Your monthly payment will be $%10.2f\n",loan.payment(rate, principal, times_compounded, time));
		
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return (p*(Math.pow((1+r/n), n*t)))/(t*12);
	}
}