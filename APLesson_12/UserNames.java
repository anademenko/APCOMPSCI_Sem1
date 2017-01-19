public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public UserNames()
	{
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameters
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessor
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main(String[]args)
	{
		UserNames object = new UserNames("proHndsm", "Professor", "Handsome");
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		object.setUserName("pHandsome");
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}