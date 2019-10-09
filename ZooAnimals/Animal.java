import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Animal extends Zoo
{
	// Animal Class

	int age, weight, location, health;
	String gender, food, species;


	public Animal () //constructor
	{
		species = "x";
		gender = "x";
		food = "x";
		location = 0;
		age = 0;
		weight = 0;
		health = 0;
	}
	public void locateAnimal ()
	{
		System.out.println("The " + species + " is located at " +location+ ".");
	}
	public void feedMe()
		{
			System.out.println();
			System.out.println("The animal " + species + " has been feed the following food: ");
			System.out.println(food);
			System.out.println("It has been fed the appropriate amount at the right time");
			System.out.println();
	}
	public void checkHealth ()
	{
		System.out.println("The health of " + species + " is " + health);
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




}