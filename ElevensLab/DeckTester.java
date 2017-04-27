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
		String[] ranks3 = new String[2];
		ranks3[0] = "King";
		ranks3[1] = "Queen";
		
		String[] suits3 = new String[2];
		suits3[0] = "Spades";
		suits3[1] = "Clubs";
		
		int[] values3 = new int[2];
		values3[0] = 9;
		values3[1] = 8;
		
		Deck three = new Deck(ranks3, suits3, values3);
		System.out.println(three.isEmpty());
		three.deal();
		System.out.println(three);
	}
}
