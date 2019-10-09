import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class stationInfo extends weatherInfo
{
	int stationNumber, temp, precip, windSpeed;
	String stationLocation;

	public stationInfo () //constructor
	{
		stationNumber = 0;
		temp = 0;
		precip = 0;
		windSpeed = 0;
		stationLocation = "XXXXX";
	}

	public void populateStation (int staNum, String stationLoc, int temperature, int precipitation, int windSpeeds)
	{
		stationNumber = staNum;
		stationLocation = stationLoc;
		temp = temperature;
		precip = precipitation;
		windSpeed = windSpeeds;
	}

	public int getTemp ()
	{
		return temp;
	}
	public int getPrecip ()
	{
		return precip;
	}
	public int getStationNumber()
	{
		return stationNumber;
	}
	public String getStationLocation ()
	{
		return stationLocation;
	}
	public int getWind ()
	{
		return windSpeed;
	}
	public String toString ()
	{

		String info = "_______";
		info += "This current weather information: \n\n";
		info += "The temperature is " + temp + "\n";
		info += "The precipitation is " + precip + "\n";
		info += "The station number is " + stationNumber + "\n";
		info += "The station location is " + stationLocation + "\n";
		info += "The wind speed is " + windSpeed + "\n";

		return info;
	}
}