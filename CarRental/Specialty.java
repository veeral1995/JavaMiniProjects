import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Specialty
	{
		int Size, typeOfSpecialty, VIN, Year, odometerValue, rentalStatus, MPG, numberOfSeats, numberOfBags;
		String Make, Model, Trim;
		double costPerDay;

	public void Specialty() //Constructor
	{
		costPerDay = 0;
		typeOfSpecialty = 0;
	}

	public void populateSpecialty (int VINnum, String Makename, String Modelname, int Yearnum, String Trimname, int odometerValuenum, int MPGnum, int numberOfSeatsnum, int numberOfBagsnum, int rentalStatusnum,int typeOfSpecialtynum, double costPerDaynum)
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
		typeOfSpecialty = typeOfSpecialtynum;
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

