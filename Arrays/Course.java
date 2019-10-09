import java.util.ArrayList;
import java.util.Scanner;

public class Course extends ArrayClasses
{

	String courseName,  sectionNumber, studentNumber;
	
	public Course () //Constructor
	{
		sectionNumber = "XXXXX";
		studentNumber = "XXXXX";
		courseName = "XXXXX";
		
		}
		
	public void populateCourse (String courseName0, String sectionNumber0, String studentNumber0)
	{
		courseName = courseName0;
		sectionNumber = sectionNumber0;
		studentNumber = studentNumber0;
	
	}
	
	public String getCourse ()
	{
		return courseName;
	}
	
	public String getSection ()
	{
		return sectionNumber;
	}
	
	public String getStudent ()
	{
		return studentNumber;
	}
	public String toString ()
	{
	
		String info = "_______";
		info += "This current information on course: \n\n";
		info += "The course name is " + courseName + "\n";
		info += "The section is " + sectionNumber + "\n";
		info += "It has " + studentNumber + " students enrolled \n";
		
		return info;
		}
		
	}