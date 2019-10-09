import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Reptile extends Animal
{
		int age, weight, location, health;
		String gender, food, species;

	public Reptile()
	{
		age = 0;
		gender = "yyy";
		location = 0;
		weight=0;
		food = "xxx";
		species = "yyy";
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

	public String toString ()
	{
		String info = "_____________________________________\n";
		info += "This current reptile information is: \n\n";
		info += "The species is: " + species + "\n";
		info += "The gender is: " + gender + "\n";
		info += "The location is: " + location + "\n";
		info += "The average lifespan is: " + age + "\n";
		info += "The average weight is: " + weight + "\n";
		info += "The diet consists of: " + food + "\n";
		info += "The health status is: " + health + "\n";

		return info;
	}


	public void feedMe()
	{
		System.out.println();
		System.out.println("The reptile " + species + " has been feed the following food: ");
		System.out.println(food);
		System.out.println("It has been fed the appropriate amount at the right time");
		System.out.println();
	}


	public int returnAge()
	{
		return age;
	}


	public int returnWeight()
	{
		return weight;
	}

	public String returnGender()
	{
		return gender;
	}

	public int returnLocation()
	{
		return location;
	}

	public String returnSpecies()
	{
		return species;
	}



}