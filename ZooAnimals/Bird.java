import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Bird extends Animal
{
	int weight, age, location, health;
	String gender, food, species;

	//This class is the Bird Class. It populates and gives information about each Bird
	// Veeral Patel CISC 230

	public Bird () //constructor
	{
		weight = 0;
		age = 0;
		food = "XXXXX";
		gender = "XXXXX";
		species = "XXXXX";
		location = 0;
		health = 0;
	}

	public void populate(String species, int location, String gender, int age, int weight,String food, int health)
		{
			this.species = species;
			this.gender = gender;
			this.food = food;
			this.location = location;
			this.age = age;
			this.weight = weight;
			this.health = health;
	}

	public String getSpecies ()
	{
		return species;
	}
	public int getLocation ()
	{
		return location;
	}
	public int getAge ()
	{
		return age;
	}
	public int getWeight ()
	{
		return weight;
	}
	public String getFood ()
	{
		return food;
	}
	public String getGender ()
	{
			return gender;
	}
	public void feedMe()
	{
		System.out.println();
		System.out.println("The bird " + species + " has been feed the following food: ");
		System.out.println(food);
		System.out.println("It has been fed the appropriate amount at the right time");
		System.out.println();
	}
	public String toString ()
	{
		String info = "_____________________________________\n";
		info += "This current bird information is: \n\n";
		info += "The species is: " + species + "\n";
		info += "The gender is: " + gender + "\n";
		info += "The location is: " + location + "\n";
		info += "The average lifespan is: " + age + "\n";
		info += "The average weight is: " + weight + "\n";
		info += "The diet consists of: " + food + "\n";

		return info;
	}

}