public class Volunteers extends Employee
{

	String firstName, lastName, jobTitle, phoneNum;
	int salary, workID, pay;

	public Volunteers()
	{
		firstName = "XXXX";
		lastName = "XXXX";
		jobTitle = "XXXX";
		phoneNum = "XXX-XXX-XXXX";
		salary=0;
		workID=0;
		pay = 0;
	}
	public String returnFirstName()
	{
		return firstName;
	}
	public String returnLastName()
	{
		return lastName;
	}
	public String returnJobTitle()
	{
		return jobTitle;
	}
	public String returnPhoneNum()
	{
		return phoneNum;
	}
	public int returnSalary()
	{
		return salary;
	}
	public int returnWorkID()
	{
		return workID;
	}
	public void payMe()
	{
		System.out.println();
		System.out.println("Volunteer Summary: ");
		System.out.println("Volunteer name: " + firstName + " " + lastName);
		System.out.println("Thanks for the hard work!");

		System.out.println();


	}
	public void populate(String firstName,String lastName,String jobTitle,int salary,int workID,String phoneNum)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobTitle = jobTitle;
			this.salary = salary;
			this.workID = workID;
			this.phoneNum = phoneNum;
	}
	public String toString()
	{
		String info = "______________________________\n\n";
		info += "The current information on this employee is: \n";
		info += "The employee name is: " + firstName + " " + lastName + "\n";
		info += "Their job title is: " + jobTitle + "\n";
		info += "Their salary is: " + salary + "\n";
		info += "Their employee ID is: " + workID + "\n";
		info += "Their phone number is: " + phoneNum + "\n";

		return info;
	}



}