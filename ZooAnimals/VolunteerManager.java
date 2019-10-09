public class VolunteerManager extends Employee
{
/*
*	This is the VolunteerManager class that extends Employee
*	Made by Kristen Flaherty
*	5/6/2015
*/

	String firstName, lastName, jobTitle, phoneNum;
	int salary, workID, pay;

	public VolunteerManager()
	{
		firstName = "x";
		lastName = "x";
		jobTitle = "x";
		phoneNum = "x";
		salary = 0;
		workID = 0;
		pay = 0;

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

	public int returnSalary()
	{
		return salary;
	}

	public int returnWorkID()
	{
		return workID;
	}

	public String returnPhoneNum()
	{
		return phoneNum;
	}
	public void payMe()
	{
		System.out.println();
		System.out.println("Payroll Summary: ");
		System.out.println("Emplyee name: " + firstName + " " + lastName);
		System.out.println("Salary: " + salary);
		pay = salary / 12;
		System.out.println("Emplyee will be paid " + pay + " for this month.");
		System.out.println();


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