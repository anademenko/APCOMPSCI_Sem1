import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, my name is RudeAI.");
		
		System.out.println("I'd like to ask you a few questions.");
		
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println(name + "? That's nice.");
		
		
		System.out.println("How old are you, " + name + "?");
		
		int age = keyboard.nextInt();
		
		System.out.println("You're " + age + " years old, huh? You don't look " + age + ".");
		
		
		System.out.println("What do you for for fun, " + name + "?");
		
		String fun = keyboard.next();
		
		System.out.println("Really? You " + fun + "? That's it?");
		
		
		System.out.println("Alright, " + name + ". What kind of music do you prefer to listen to?");
		
		String music = keyboard.next();
		
		System.out.println("Of course you listen to " + music + ". I can't say I'm surprised.");
		
		
		System.out.println("How many siblings do you have, " + name + "?");
		
		int siblings = keyboard.nextInt();
		
		System.out.println("You have " + siblings + " siblings? I can't help but wonder if they're anything like you. I hope not.");
		
		
		System.out.println("Okay, I have one more question for you. What do you hope to be when you grow up?");
		
		String hope = keyboard.next();
		
		System.out.println("A " + hope + "? Good luck with that.");
		
		
		System.out.println("So, " + name + ", you're " + age + " years old and you like to " + fun + ".");
		
		System.out.println("You listen to " + music + " and you have " + siblings + " siblings.");
		
		System.out.println("Good luck becoming a " + hope + ".");
		
		System.out.println("I'm only kiddin' " + name + ". You're awesome.");
		
	}
}