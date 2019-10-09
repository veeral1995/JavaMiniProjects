import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class CarCustomer
	{
		int customerStatus, Age;
		String Name, Address, phoneNumber;
		long SSN;

	public void CarCustomer () //Constructor
	{
		customerStatus = 0;
	}


	public void populateCustomer (String Namex, String Addressx, int Agex, String phoneNumberx, long SSNx, int customerStatusx)
	{
			Name = Namex;
			Address = Addressx;
			Age = Agex;
			phoneNumber = phoneNumberx;
			SSN = SSNx;
			customerStatus = customerStatusx;
	}

	public String getName ()
	{
		return Name;
	}

	}

