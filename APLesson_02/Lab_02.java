public class Lab_02
{
	public static void main(String[]args)
	{
		int x = 7;
		int y = 6;
		
		System.out.println(x + " multiplied by " + y + " is " + x*y);
		
		String name = "Anastasiya Demenko";
		String address = "4668 Da Vinci Street";
		String city = "San Diego CA";
		int zip = 92130;
		
		System.out.println(name+"\n"+address+"\n"+city+"\n"+zip);
		
		int l = 1;
		int h = 2;
		int w = 3;
		int surfacearea = 2* (w*l + h*l + h*w);
		
		System.out.println("The surface area of your rectangular prism is " + surfacearea);
	}
}