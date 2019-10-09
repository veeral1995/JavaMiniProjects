import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Person
	{
		int Age;
		String Name, Address, phoneNumber;
		long SSN;

	public void Person () //Constructor
	{
		Age = 0;
		phoneNumber = "XXXXX";
		SSN = 0;
		Name = "XXXXX";
		Address = "XXXXX";
	}

	public String getName ()
	{
		return Name;
	}
}
