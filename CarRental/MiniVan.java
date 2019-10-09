import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class MiniVan
	{
		int VIN, Year, odometerValue, Size, rentalStatus, MPG, numberOfSeats, numberOfBags;
		String Make, Model, Trim;
		double costPerDay;

	public void MiniVan() //Constructor
	{
		costPerDay = 0;
	}

	public void populateMiniVan (int VINnum, String Makename, String Modelname, int Yearnum, String Trimname, int odometerValuenum, int MPGnum, int numberOfSeatsnum, int numberOfBagsnum, int rentalStatusnum, double costPerDaynum)
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
