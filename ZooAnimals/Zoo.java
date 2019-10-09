import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Zoo
{
	// Zoo Main Class

	public static void main (String[] args) throws IOException
	{

		int age, weight, location, health;
		String gender, food, species;

		String firstName, lastName, jobTitle, phoneNum;
		int salary, workID, pay;

		species = "x";
		gender = "x";
		food = "x";
		location = 0;
		age = 0;
		weight = 0;
		health = 0;

		firstName = "x";
		lastName = "x";
		jobTitle = "x";
		phoneNum = "x";
		salary = 0;
		workID = 0;
		pay=0;

		Animal [] animals = new Animal [20];
		animals [0] = new Fish();
		animals [1] = new Fish();
		animals [2] = new Fish();
		animals [3] = new Fish();
		animals [4] = new Fish();
		animals [5] = new Mammal();
		animals [6] = new Mammal();
		animals [7] = new Mammal();
		animals [8] = new Mammal();
		animals [9] = new Mammal();
		animals [10] = new Bird();
		animals [11] = new Bird();
		animals [12] = new Bird();
		animals [13] = new Bird();
		animals [14] = new Bird();
		animals [15] = new Reptile();
		animals [16] = new Reptile();
		animals [17] = new Reptile();
		animals [18] = new Mammal();
		animals [19] = new Bird();

		String fileName = "FileAnimals.dat";

		StringTokenizer tokenizer;
		String line;
		int i=0;

		try
		{
			File file = new File (fileName);
			Scanner inFile = new Scanner(file);

			while(inFile.hasNext())
			{
				line = inFile.nextLine();
				tokenizer = new StringTokenizer (line, ",");

				try
				{
					species = tokenizer.nextToken();
					location = Integer.parseInt (tokenizer.nextToken());
					gender = tokenizer.nextToken();
					age = Integer.parseInt (tokenizer.nextToken());
					weight = Integer.parseInt (tokenizer.nextToken());
					food = tokenizer.nextToken();
					health = Integer.parseInt (tokenizer.nextToken());

				}
				catch (NumberFormatException exception)
				{
					System.out.println("Error in input, line ignored");
					System.out.println(line);
				}

				animals [i].populate(species, location, gender, age, weight, food, health);

				i=i+1;

			}


			inFile.close();
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("The file " + fileName + " was not found.");
		}

		i=0;
		for (i=0; i < animals.length; i++)
		{
			System.out.println();
			System.out.println(animals [i]);
			System.out.println();
		}

		i=0;
		for (i=0; i < animals.length; i++)
		{
			System.out.println();
			animals[i].feedMe();
			System.out.println();
		}


	//Employees

		Employee [] employee = new Employee[10];
		employee[0] = new ZooManager();
		employee[1] = new Zookeeper();
		employee[2] = new Veterinarian();
		employee[3] = new GuestServices();
		employee[4] = new GuestServices();
		employee[5] = new VolunteerManager();
		employee[6] = new Volunteers();
		employee[7] = new Volunteers();
		employee[8] = new Volunteers();
		employee[9] = new VetTech();

		String fileName2 = "EmployeeList.dat";

				//StringTokenizer tokenizer;
				//String line;
				i=0;

				try
				{
					File file = new File (fileName2);
					Scanner inFile = new Scanner(file);

					while(inFile.hasNext())
					{
						line = inFile.nextLine();
						tokenizer = new StringTokenizer (line, ",");

						try
						{
							firstName = tokenizer.nextToken();
							lastName = tokenizer.nextToken();
							jobTitle = tokenizer.nextToken();
							salary = Integer.parseInt (tokenizer.nextToken());
							workID = Integer.parseInt (tokenizer.nextToken());
							phoneNum = tokenizer.nextToken();

						}
						catch (NumberFormatException exception)
						{
							System.out.println("Error in input, line ignored");
							System.out.println(line);
						}

						employee [i].populate(firstName, lastName, jobTitle, salary, workID, phoneNum);

						i=i+1;

					}


					inFile.close();
				}
				catch (FileNotFoundException exception)
				{
					System.out.println("The file " + fileName2 + " was not found.");
				}

				i=0;
				for (i=0; i < employee.length; i++)
				{
					System.out.println();
					System.out.println(employee [i]);
					System.out.println();
				}

				i=0;
				for (i=0; i < employee.length; i++)
				{
					System.out.println();
					employee[i].payMe();
					System.out.println();
				}

	}


}