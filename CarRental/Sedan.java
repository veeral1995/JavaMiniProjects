import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Sedan
	{
		int VIN, Year, odometerValue, Size, rentalStatus, MPG, numberOfSeats, numberOfBags;
		String Make, Model, Trim;
		double costPerDay;

	public void Sedan () //Constructor
	{
		Size = 0;
		costPerDay = 0;
	}

	public void populateSedan (int VINnum, String Makename, String Modelname, int Yearnum, String Trimname, int odometerValuenum, int MPGnum, int numberOfSeatsnum, int numberOfBagsnum, int rentalStatusnum, int Sizenum, double costPerDaynum)
	{
		VIN = VINnum;
		Make = Makename;
		Model = Modelname;
		Year = Yearnum;
		Trim = Trimname;
		odometerValue = odometerValuenum;
		MPG = MPGnum;
		numberOfSeats = numberOfSeatsnum;
		numberOfBags = numberOfBagsnum;
		rentalStatus = rentalStatusnum;
		Size = Sizenum;
		costPerDay = costPerDaynum;
	}

	public double getCostPerDay ()
	{
		return costPerDay;
	}

	public String getMake ()
	{
		return Make;
	}

	public String getModel ()
	{
		return Model;
	}

	}


