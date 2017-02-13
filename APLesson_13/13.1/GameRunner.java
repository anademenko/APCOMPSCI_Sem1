public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem object1 = new XBox("XBox");
		Console object2 = new PlayStation("PlayStation");
		PC object3 = new PC("PC");
		
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}
}