import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class weatherInfo
{
	// Veeral Patel, Weather Info

public static void main (String[] args) throws IOException
{
	int i, temp, precip, windSpeed, stationNumber;

	stationNumber = 0;
	temp = 0;
	precip = 0;
	windSpeed = 0;
	String stationLocation = "XXXX";

	stationInfo[] reports = new stationInfo[20];

	for (i=0; i<20; i++)
	{
		reports[i] = new stationInfo();
	}

	String newFile = "weatherreports.dat";

	StringTokenizer tokenizer;
	String line;
	try
	{
		File file = new File (newFile);
		Scanner inFile = new Scanner (file);

		while(inFile.hasNext())
		{
			line = inFile.nextLine();
			tokenizer = new StringTokenizer(line);

		try
		{
			stationNumber = Integer.parseInt(tokenizer.nextToken());
			stationLocation = tokenizer.nextToken();
			temp = Integer.parseInt(tokenizer.nextToken());
			precip = Integer.parseInt(tokenizer.nextToken());
			windSpeed = Integer.parseInt(tokenizer.nextToken());
		}

		catch (NumberFormatException exception)
		{
			System.out.println("ERROR");
		    System.out.println(line);
		}
		reports[i].populateStation(stationNumber, stationLocation, temp, precip, windSpeed);
	}
	inFile.close();
	}
	catch (FileNotFoundException exception)
	{
		System.out.println("File Is Not Found");
	}

	int highTemp = 0;
	int currentTemp = 0;
	int highStationNumber = 0;
	int currentStationNumber = 0;
	for (i=0;i<20;i++)
	{
		currentTemp = reports[i].getTemp();
		System.out.println(i);
		currentStationNumber = i;
	if (currentTemp > highTemp)
	{
		highTemp = currentTemp;
		highStationNumber = currentStationNumber+1;
	}
	}

	System.out.println("The highest temperature was found in station " + highStationNumber + " with a temperature of: " + highTemp);

	int lowSpeed = 0;
	int currentSpeed = 0;
	int lowStationNumber = 0;
	currentStationNumber = 0;

	for (i=0;i<20;i++)
		{
			currentSpeed = reports[i].getWind();
			currentStationNumber = i;
		if (currentSpeed<lowSpeed)
		{
			lowSpeed = currentSpeed;
			lowStationNumber = currentStationNumber+1;
		}
		}

	System.out.println("The lowest wind speed was found in station " + lowStationNumber + " with a wind speed of: " + lowSpeed);
}
}

