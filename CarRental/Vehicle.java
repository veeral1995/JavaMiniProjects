import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Vehicle
	{
		int VIN, Year, odometerValue, MPG, numberOfSeats, numberOfBags, rentalStatus;
		String Make, Model, Trim;

	public void Vehicle () //Constructor
	{
		VIN = 0;
		Model = "XXXXX";
		Year = 0;
		Trim = "XXXXX";
		odometerValue = 0;
		MPG = 0;
		numberOfSeats = 0;
		numberOfBags = 0;
		rentalStatus = 0;
		Make = "XXXXX";
	}

	public String returnMake ()
	{
		return Make;
	}

	public String returnModel ()
	{
		return Model;
	}

}

