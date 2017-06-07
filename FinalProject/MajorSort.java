public class MajorSort
{
	private String major;
	private String category;
	private String courses;
	private String career;
	
	public MajorSort()
	{
		major= "";
		category = "";
	}
	
	public MajorSort(String m)
	{
		major= m;
		category = category(major);
		courses = courses(category);
		career = career(major);
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
	
	public String getCareer()
	{
		return career;
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
				   "<br>\tWriting and Rhetoric I and II (3 credits each)" +
				   "<br>\tIntro to Business (3 credits)" +
				   "<br>\tPublic Speaking (3 credits)" +
				   "<br>\tPrinciples Microeconomics (3 credits)" +
				   "<br>\tCalculus for Business (3 credits)" +
				   "<br>\tIntro to Marketing (3 credits)" +
				   "<br>\tInternational Business, Management, and Marketing (3 credits each)" +
				   "<br>\tStrategic Management (3 credits)";
		}
		else if(c.equals("Science"))
		{
			return "REQUIRED COURSES" +
				   "<br>\tGeneral Biology I and II with Lab (3 credits + 1 credit for Lab each)" +
				   "<br>\tGeneral Chemistry I and II with Lab (3 credits + 1 credit for Lab each)" +
				   "<br>\tGeneral Physics Lab I and II (1 credit each)" +
				   "<br>\tCalculus I (4 credits)" +
				   "<br>\tCalculus II (4 credits)" +
				   "<br>\tWriting and Rhetoric (3 credits)" +
				   "<br>\tOrganic Chemistry with Lab (4 credits + 1 credit for Lab)" +
				   "<br>\tEcology (3 credits)" +
				   "<br>\tSenior Seminar (1 credit)";
		}
		else if(c.equals("Engineering") || c.equals("Technology"))
		{
			return "REQUIRED COURSES" +
				   "<br>\tIntro to Engineering (2 credits)" +
				   "<br>\tGeneral Chemistry with Lab (4 credits)" +
				   "<br>\tMultivariable Calculus (4 credits)" +
				   "<br>\tDifferential Equations (3 credits)" +
				   "<br>\tPhysics with Calculus (4 credits)" +
				   "<br>\tGeneral Physics Lab (2 credits)" +
				   "<br>\tSenior Design (4 credits)";
		}
		else if(c.equals("Mathematics"))
		{
			return "REQUIRED COURSES" + 
				   "<br>\tIntroduction to Advance Mathematics (3 credits)" + 
				   "<br>\tAdvanced Calculus (3 credits)" +
				   "<br>\tAlgebraic Structures (3 credits)" +
				   "<br>\tMathematical Statistics (3 credits)" +
				   "<br>\tSenior Seminar (1 credit)" +
				   "<br>In addition, three courses from each of the following lists: " +
				   "<br>List One" +
				   "<br>\tIntroduction to Combinatorics (3 credits) /n/tComplex Variables (3 credits) /n/tCollege Geometry (3 credits) \n\tNumber Theory (3 credits) \n\tTopics in Advanced Calculus (3 credits) \n\tTopics in Algebraic Structures (3 credits) \n\tTopology (3 credits)" +
				   "<br>List Two" +
				   "<br>\tAdvanced Differential Equations (3 credits) \n\tGraph Theory (3 credits) \n\tMathematical Modeling (3 credits) \n\tMathematical Statistics II (3 credits) \n\tNumerical Analysis (3 credits) \n\tMathematical Logic (3 credits) \n\tAxiomatic Set Theory (3 credits)";
		}
		else if(c.equals("Arts"))
		{
			return "REQUIRED COURSES" +
				   "<br>\tArt History (3 credits)" +
				   "<br>\tWriting and Rhetoric (3 credits)" +
				   "<br>\t2D and 3D Design (3 credits each)" +
				   "<br>\tModern and Contemporary Art (3 credits each)" +
				   "<br>\tArt Electives (3 credits each)" +
				   "<br>\tThesis I (3 credits)" +
				   "<br>\tThesis II (3 credits)";
		}	
		else if(c.equals("Humanities"))
		{
			return "REQUIRED COURSES" +
				   "<br>\tFirst Year Experience (1 credit)" +
				   "<br>\tWriting and Rhetoric I (3 credits)" +
				   "<br>\tWriting and Rhetoric II (3 credits)" +
				   "<br>\tAmerican Government (3 credits)" +
				   "<br>\tLaw and Ethics(Criminal Justice, Journalism) (3 credits)" +
				   "<br>\tSenior Thesis/Project (3 credits)";
		}
		return "";
	}
	
	public String career(String m)
	{
		if(m.equals("Accounting"))
			return "<br>\tBudget Analyst" + 
				   "<br>\tForensic Accountant" + 
				   "<br>\tTax Accountant";
		else if (m.equals("Advertising and Marketing"))
			return "<br>\tAdvertising" + 
				   "<br>\tPromotions" + 
				   "<br>\tMarketing Manager" + 
				   "<br>\tMarket Research Analyst" + 
				   "<br>\tMeeting" + 
				   "<br>\tConvention" + 
				   "<br>\tEvent Planner";
		else if (m.equals("Animation"))
			return "<br>\tCartoonist" + 
				   "<br>\tMotion Graphics Designer" + 
				   "<br>\tStoryboard Artist";
		else if (m.equals("Applied Mathematics"))
			return "<br>\tFluid Dynamics" + 
				   "<br>\tGame Theory" + 
				   "<br>\tOperations Research";
		else if (m.equals("Biology"))
			return "<br>\tMicrobiologist" + 
				   "<br>\tPharmacologist" + 
				   "<br>\tResearch Scientist";
		else if (m.equals("Biomathematics"))
			return "<br>\tBiostatistician" + 
				   "<br>\tMathematics Professor" + 
				   "<br>\tResearch Scientist";
		else if (m.equals("Biomedical Engineering"))
			return "<br>\tBioinstrumentation" + 
				   "<br>\tBiomaterials" + 
				   "<br>\tBiomechanics";
		else if (m.equals("Business Administration"))
			return "<br>\tBusiness Services Coordinator" + 
				   "<br>\tGlobal Program Manager" + 
				   "<br>\tInvestment Analyst";
		else if (m.equals("Chemistry"))
			return "<br>\tToxicologist" + 
				   "<br>\tResearch Scientist" + 
				   "<br>tForensic Scientist" + 
				   "<br>\tChemical Engineer" + 
				   "<br>\tClinical Biochemistry" + 
				   "<br>\tAnalytical Chemist" + 
				   "<br>\tPharmacologist";
		else if (m.equals("Computer Programming") || m.equals("Computer Science"))
			return "<br>\tSoftware Applications Developer" + 
				   "<br>\tComputer Systems Analyst" + 
				   "<br>\tNetwork Systems Administrator" + 
				   "<br>\tWeb Developer";
		else if (m.equals("Criminal Justice"))
			return "<br>\tParalegal" + 
				   "<br>\tPolice Officer" + 
				   "<br>\tPrivate Investigator" + 
				   "<br>\tHomicide Detective" + 
				   "<br>\tFBI Agent" + 
				   "<br>\tDEA Agent" + 
				   "<br>\tAir Marshal" + 
				   "<br>\tBorder Patrol Agent";
		else if (m.equals("Economics"))
			return "<br>\tMarket Research Analyst" + 
				   "<br>\tEconomic Consultant, Actuary" + 
				   "<br>\tCredit Analyst" + 
				   "<br>\tLawyer" + 
				   "<br>\tAccountant";
		else if (m.equals("Electrical Engineering"))
			return "<br>\tElectrician";
		else if (m.equals("English"))
			return "<br>\tNews Reporter" + 
				   "<br>\tPublic Relations" + 
				   "<br>\tBlogger" + 
				   "<br>\tContent Marketing" + 
				   "<br>\tTechnical Writer" + 
				   "<br>\tJournalism" + 
				   "<br>\tSales" + 
				   "<br>\tStock Broker";
		else if (m.equals("Environmental Science"))
			return "<br>\tRecycling Officer" + 
				   "<br>\tNature Conservation Officer" + 
				   "<br>\tWaste Management Officer" + 
				   "<br>\tWater Quality Scientist";
		else if (m.equals("Game Design"))
			return "<br>\tGame Animator" + 
				   "<br>\tGame Audio Engineer" + 
				   "<br>\tGame Programmer" + 
				   "<br>\tCreative Game Director" + 
				   "<br>\tGame Artist";
		else if (m.equals("History"))
			return "<br>\trchivist" + 
				   "<br>\tEditorial Assistant" + 
				   "<br>\tArchaeologist" + 
				   "<br>\tAcademic Librarian" + 
				   "<br>\tBroadcast Journalist" + 
				   "<br>\tInformation Officer";
		else if (m.equals("Journalism"))
			return "<br>\tForeign Correspondent" + 
				   "<br>\tInvestigative Journalist" + 
				   "<br>\tColumnist" + 
				   "<br>\tProfessor" + 
				   "<br>\tSportscaster";
		else if (m.equals("Mechanical Engineering"))
			return "<br>\tMachinery Manufacturing" + 
				   "<br>\tAerospace Manufacturing" + 
				   "<br>\tNuclear Engineer" + 
				   "<br>'tAutomotive Engineer";
		else if (m.equals("Photography"))
			return "<br>\tGraphic Designer" + 
				   "<br>\tMagazine Features Editor" + 
				   "<br>\tMedical Illustrator" + 
				   "<br>\tTV Camera Operator";
		else if (m.equals("Physics"))
			return "<br>\tGeophysicist" + 
				   "<br>\tMetallurgist" + 
				   "<br>\tResearch Scientist" + 
				   "<br>\tSeismic Interpreter";
		else if (m.equals("Political Science"))
			return "<br>\tAttorney" + 
				   "<br>\tLegislative Assistant" + 
				   "<br>\tPolicy Analyst" + 
				   "<br>\tPolitical Consultant";
		else if (m.equals("Psychology"))
			return "<br>\tChild Psychologist" + 
				   "<br>\tClinical Psychologist" +
				   "<br>\tCounselor" + 
				   "<br>\tSocial Worker";
		else if (m.equals("Statistics"))
			return "<br>\tActuary" + 
				   "<br>\tAppraiser" + 
				   "<br>\tBiostatistician" + 
				   "<br>\tStatistical Consultant";
		else if (m.equals("Theatre"))
			return "<br>\tDancer" + 
				   "<br>\tDirector" + 
				   "<br>\tPlaywright" + 
				   "<br>\tStage Manager";
		return "";
	}
	
	public String toString()
	{
		return "<html>Major: " + getMajor() + "<br><br>Category: " + getCategory() + "<br><br>Course List: <br>" + getCourses() + "<br><br>Potential Careers: " + getCareer() + "</html>";
	}
}