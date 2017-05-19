public class Sorting
{
	private String major;
	private String category;
	private String courses;
	
	public Sorting()
	{
		major= "";
		category = "";
	}
	
	public Sorting(String m)
	{
		major= m;
		category = category(major);
		courses = courses(category);
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String getCourses()
	{
		return courses;
	}
	
	public String category(String major)
	{
		if(major.equals("Business Administration") ||
		   major.equals("Accounting") ||
		   major.equals("Economics") ||
		   major.equals("Advertising and Marketing"))
		   {
			   return "Business";
		   }
		else if(major.equals("Biology") || 
		   major.equals("Chemistry") ||
		   major.equals("Physics") ||
		   major.equals("Environmental Science") ||
		   major.equals("Psychology"))
		   {
			   return "Science";
		   }
		else if(major.equals("Electrical Engineering") || 
		   major.equals("Mechanical Engineering") ||
		   major.equals("Biomedical Engineering"))
		   {
			   return "Engineering";
		   }
		else if(major.equals("Computer Science") ||
				major.equals("Game Design") ||
				major.equals("Computer Programming"))
		   {
			   return "Technology";
		   }
		else if(major.equals("Applied Mathematics") || 
		   major.equals("Statistics") ||
		   major.equals("Biomathematics"))
		   {
			   return "Mathematics";
		   }
		else if(major.equals("Animation") || 
		   major.equals("Photography") ||
		   major.equals("Theatre"))
		   {
			   return "Arts";
		   }
		else if(major.equals("Journalism") || 
		   major.equals("Criminal Justice") ||
		   major.equals("English") ||
		   major.equals("History") ||
		   major.equals("Political Science"))
		   {
			   return "Humanities";
		   }   
		return "";
	}
	
	public String courses(String c)
	{
		if(c.equals("Business"))
		{
			return "REQUIRED COURSES" +
				   "\n\tWriting and Rhetoric I and II (3 credits each)" +
				   "\n\tIntro to Business (3 credits)" +
				   "\n\tPublic Speaking (3 credits)" +
				   "\n\tPrinciples Microeconomics (3 credits)" +
				   "\n\tCalculus for Business (3 credits)" +
				   "\n\tIntro to Marketing (3 credits)" +
				   "\n\tInternational Business, Management, and Marketing (3 credits each)" +
				   "\n\tStrategic Management (3 credits)";
		}
		else if(c.equals("Science"))
		{
			return "REQUIRED COURSES" +
				   "\n\tGeneral Biology I and II with Lab (3 credits + 1 credit for Lab each)" +
				   "\n\tGeneral Chemistry I and II with Lab (3 credits + 1 credit for Lab each)" +
				   "\n\tGeneral Physics Lab I and II (1 credit each)" +
				   "\n\tCalculus I (4 credits)" +
				   "\n\tCalculus II (4 credits)" +
				   "\n\tWriting and Rhetoric (3 credits)" +
				   "\n\tOrganic Chemistry with Lab (4 credits + 1 credit for Lab)" +
				   "\n\tEcology (3 credits)" +
				   "\n\tSenior Seminar (1 credit)";
		}
		else if(c.equals("Engineering") || c.equals("Technology"))
		{
			return "REQUIRED COURSES" +
				   "\n\tIntro to Engineering (2 credits)" +
				   "\n\tGeneral Chemistry with Lab (4 credits)" +
				   "\n\tMultivariable Calculus (4 credits)" +
				   "\n\tDifferential Equations (3 credits)" +
				   "\n\tPhysics with Calculus (4 credits)" +
				   "\n\tGeneral Physics Lab (2 credits)" +
				   "\n\tSenior Design (4 credits)";
		}
		else if(c.equals("Mathematics"))
		{
			return "REQUIRED COURSES" + 
				   "\n\tIntroduction to Advance Mathematics (3 credits)" + 
				   "\n\tAdvanced Calculus (3 credits)" +
				   "\n\tAlgebraic Structures (3 credits)" +
				   "\n\tMathematical Statistics (3 credits)" +
				   "\n\tSenior Seminar (1 credit)" +
				   "\nIn addition, three courses from each of the following lists: " +
				   "\nList One" +
				   "\n\tIntroduction to Combinatorics (3 credits) /n/tComplex Variables (3 credits) /n/tCollege Geometry (3 credits) \n\tNumber Theory (3 credits) \n\tTopics in Advanced Calculus (3 credits) \n\tTopics in Algebraic Structures (3 credits) \n\tTopology (3 credits)" +
				   "\nList Two" +
				   "\n\tAdvanced Differential Equations (3 credits) \n\tGraph Theory (3 credits) \n\tMathematical Modeling (3 credits) \n\tMathematical Statistics II (3 credits) \n\tNumerical Analysis (3 credits) \n\tMathematical Logic (3 credits) \n\tAxiomatic Set Theory (3 credits)";
		}
		else if(c.equals("Arts"))
		{
			return "REQUIRED COURSES" +
				   "\n\tArt History (3 credits)" +
				   "\n\tWriting and Rhetoric (3 credits)" +
				   "\n\t2D and 3D Design (3 credits each)" +
				   "\n\tModern and Contemporary Art (3 credits each)" +
				   "\n\tArt Electives (3 credits each)" +
				   "\n\tThesis I (3 credits)" +
				   "\n\tThesis II (3 credits)";
		}	
		else if(c.equals("Humanities"))
		{
			return "REQUIRED COURSES" +
				   "\n\tFirst Year Experience (1 credit)" +
				   "\n\tWriting and Rhetoric I (3 credits)" +
				   "\n\tWriting and Rhetoric II (3 credits)" +
				   "\n\tAmerican Government (3 credits)" +
				   "\n\tLaw and Ethics(Criminal Justice, Journalism) (3 credits)" +
				   "\n\tSenior Thesis/Project (3 credits)";
		}
		return "";
	}
	
	public String toString()
	{
		return "Major: " + getMajor() + "\nCategory: " + getCategory() + "\nCourse List: \n" + getCourses();
	}
}