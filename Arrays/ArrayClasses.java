import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClasses
{

	public static void main(String[] args)
	{

		int howMany, location0, location1, location2, location3;
		String search, foundString1, foundString0, classes;
		
		String class0Name, class1Name, class2Name, class3Name, class4Name, class5Name;
		String class6Name, class7Name, class8Name, class9Name, class10Name;

		ArrayList courses = new ArrayList();
		Scanner keyboard = new Scanner(System.in);
		
		Course class0 = new Course ();
		Course class1 = new Course ();
		Course class2 = new Course ();
		Course class3 = new Course ();
		Course class4 = new Course ();
		Course class5 = new Course ();
		Course class6 = new Course ();
		Course class7 = new Course ();
		Course class8 = new Course ();
		Course class9 = new Course ();
		Course class10 = new Course ();
		
		class0.populateCourse("CISC130", "1", "22");
		class1.populateCourse("CISC131", "1", "31");
		class2.populateCourse("CISC200", "2", "22");
		class3.populateCourse("CISC230", "4", "24");
		class4.populateCourse("CISC210", "6", "30");
		class5.populateCourse("CISC231", "2", "21");
		class6.populateCourse("CISC270", "3", "19");
		class7.populateCourse("CISC310", "6", "15");
		class8.populateCourse("CISC342", "1", "35");
		class9.populateCourse("CISC419", "5", "24");
		class10.populateCourse("CISC450", "3", "31");
		
		class0Name = class0.getCourse();
		class1Name = class1.getCourse();
		class2Name = class2.getCourse();
		class3Name = class3.getCourse();
		class4Name = class4.getCourse();
		class5Name = class5.getCourse();
		class6Name = class6.getCourse();
		class7Name = class7.getCourse();
		class8Name = class8.getCourse();
		class9Name = class9.getCourse();
		class10Name = class10.getCourse();
		
		courses.add(class0Name);
		courses.add(class1Name);
		courses.add(class2Name);
		courses.add(class3Name);
		courses.add(class4Name);
		courses.add(class5Name);
		courses.add(class6Name);
		courses.add(class7Name);
		courses.add(class8Name);
		courses.add(class9Name);
		courses.add(class10Name);
		
		howMany = courses.size();
		System.out.println("Here is the amount of classes: " + howMany);
		System.out.println("Names of Classes: " + courses);

		System.out.println("Enter Which Class You Would Like To Search For:");
		search = keyboard.nextLine();

		if (courses.contains(search))
		{
			location0 = courses.indexOf(search);
			
			
			
		}
		else
			{
				System.out.println("Course Was Not Found");
			}


	}
}