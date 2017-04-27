/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("Five", "Clubs", 5);
		Card two = new Card("Seven", "Hearts", 7);
		Card three = new Card("Three", "Spades", 3);
		Card four = new Card("Five", "Clubs", 5); //Created to test the matches method.
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		System.out.println(one.matches(two));
		System.out.println(one.matches(four));
	}
}
