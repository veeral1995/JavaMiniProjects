import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Employee
{
	String firstName, lastName, jobTitle, phoneNum;
	int salary, workID, pay;

	public Employee()
	{
		firstName = "XXXX";
		lastName = "XXXX";
		jobTitle = "XXXX";
		phoneNum = "XXXX";
		salary=0;
		workID=0;
		pay=0;

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
	public void requestTimeOff()
	{
		System.out.println();
		System.out.println("Employee " + workID + " has requested time off. ");
		System.out.println("Employee name is: " + firstName + " " + lastName);
		System.out.println();

	}
	public void clockIn()
	{
		System.out.println();
		System.out.println("Employee " + workID + " has clocked in for work today. ");
		System.out.println("Employee name is: " + firstName + " " + lastName);
		System.out.println();
	}




}