import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class CarRegular
	{
		String Name, Address, phoneNumber;
		long SSN;
		int Age, customerStatus;

	public CarRegular () //Constructor
	{
		customerStatus = 0;
	}

	public void populateCarRegular (String Namex, String Addressx, int Agex, String phoneNumberx, long SSNx, int customerStatusx)
	{
			Name = Namex;
			Address = Addressx;
			Age = Agex;
			phoneNumber = phoneNumberx;
			SSN = SSNx;
			customerStatus = customerStatusx;
	}

	public void rentSUV (String Make, String Model, double costPerDay)
	{
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public void rentSpecialty (String Make, String Model, double costPerDay)
	{
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public void rentMiniVan (String Make, String Model, double costPerDay)
	{
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public void rentSedan (String Make, String Model, double costPerDay)
	{
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}
	}

