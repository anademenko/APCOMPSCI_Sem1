/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		//First deck object.
		String[] ranks1 = new String[3];
		ranks1[0] = "A";
		ranks1[1] = "B";
		ranks1[2] = "C";
		
		String[] suits1 = new String[2];
		suits1[0] = "Giraffes";
		suits1[1] = "Lions";
		
		int[] values1 = new int[3];
		values1[0] = 2;
		values1[1] = 1;
		values1[2] = 6;
		
		Deck one = new Deck(ranks1, suits1, values1);
		System.out.println(one.isEmpty());
		one.deal();
		System.out.println(one);
		
		//Second deck object.
		String[] ranks2 = new String[2];
		ranks2[0] = "X";
		ranks2[1] = "Y";
		
		String[] suits2 = new String[2];
		suits2[0] = "Greens";
		suits2[1] = "Blues";
		
		int[] values2 = new int[2];
		values2[0] = 5;
		values2[1] = 6;
		
		Deck two = new Deck(ranks2, suits2, values2);
		System.out.println(two.isEmpty());
		two.deal();
		System.out.println(two);
		
		//Third deck object.
		String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		int[] pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		
		Deck d = new Deck(ranks, suits, pointValues);
		d.deal();
		System.out.println(d);
		
		
	}
}
