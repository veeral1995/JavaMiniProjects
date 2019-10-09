public class Fish extends Animal
{
/*
*	This is the Fish Class that extends from Animal
*	Made by Kristen Flaherty
*	5/4/2015
*/

	String species, gender, food;
	int age, weight, location, health;

	public Fish()
	{
		species = "x";
		gender = "x";
		food = "x";
		location = 0;
		age = 0;
		weight = 0;
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

	public String returnSpecies()
	{
		return species;
	}

	public String returnGender()
	{
		return gender;
	}

	public String returnFood()
	{
		return food;
	}

	public int returnLocation()
	{
		return location;
	}

	public int returnAge()
	{
		return age;
	}

	public int returnWeight()
	{
		return weight;
	}

	public int returnHealth()
	{
		return health;
	}

	public void feedMe()
	{
		System.out.println();
		System.out.println("The fish " + species + " has been fed the following food:");
		System.out.println(food);
		System.out.println("It has been fed the appropriate amount at the right time");
		System.out.println();
	}

	public String toString ()
	{
	    String info = "_____________________________________\n";
	    info += "This current fish information is: \n\n";
	    info += "The species is: " + species + "\n";
	    info += "The gender is: " + gender + "\n";
	    info += "The location is: " + location + "\n";
	    info += "The average lifespan is: " + age + "\n";
	    info += "The average weight is: " + weight + "\n";
	    info += "The diet consists of: " + food + "\n";
	    info += "The health status is: " + health + "/n";

	    return info;
	 }
}