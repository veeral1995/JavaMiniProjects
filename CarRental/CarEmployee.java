import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class CarEmployee
	{
		int employeeID, Age;
		String jobTitle, Name, Address, phoneNumber;
		double payAmount;
		long SSN;

	public void CarEmployee () //Constructor
	{
		jobTitle = "XXXXX";
		employeeID = 0;
		payAmount = 0;
	}

	public void populateCarEmployee (String Namex, String Addressx, int Agex, String phoneNumberx, long SSNx, int employeeIDx, String jobTitlex, double payAmountx)
	{
		payAmount = payAmountx;
		Name = Namex;
		Address = Addressx;
		Age = Agex;
		phoneNumber = phoneNumberx;
		employeeID = employeeIDx;
		jobTitle = jobTitlex;

	}

	public String getName ()
	{
		return Name;
	}
	}

