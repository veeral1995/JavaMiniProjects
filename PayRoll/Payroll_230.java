import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Payroll_230
{
	// This program will generate the payroll for employees
	// Generated by Veeral Patel

	public static void main(String[] args)
	{
		Random randomNum = new Random();
		DecimalFormat dform = new DecimalFormat ("0.##");
		Scanner keyboard = new Scanner(System.in);

		String firstName, lastName;
		int regHours, overHours, diceRoll;
		float hourRate, finalPay1, finalPay2, finalPay3, finalPay4, finalPay5, overHoursPay;

		System.out.println("Welcome to our Payroll System");
		System.out.println("After we get your information for this pay period");
		System.out.println("we will calculate your pay for the week");
		System.out.println();

		System.out.println("Please Enter Your First Name");
		firstName = keyboard.nextLine();
		System.out.println();

		System.out.println("Please Enter Your Last Name");
		lastName = keyboard.nextLine();
		System.out.println();

		System.out.println("How Many Hours Have You Worked This Week?");
		regHours = keyboard.nextInt();
		System.out.println();

		System.out.println("How Many Overtime Hours Have You Worked This Week?");
		overHours = keyboard.nextInt();
		System.out.println();

		System.out.println("What Is Your Hourly Rate?");
		hourRate = (float)keyboard.nextFloat();
		System.out.println();

		System.out.println("Your base pay for this week is: " + regHours*hourRate);
		System.out.println();

		System.out.println("Lets roll a die to determine your bonus!");
		System.out.println("The bonus is $20 times the die roll value.");
		System.out.println();

		diceRoll = randomNum.nextInt();
		diceRoll = Math.abs(diceRoll%6)+1;
		System.out.println("The die roll came up: " + diceRoll);
		System.out.println("Your bonus is: " + "$" + diceRoll*20);
		System.out.println();

		finalPay1 = regHours*hourRate;
		overHoursPay = hourRate*(float)1.5;
		finalPay2 = overHours*overHoursPay;
		finalPay3 = finalPay1+finalPay2;
		finalPay4 = diceRoll*20;
		finalPay5 = finalPay4+finalPay3;

		System.out.println("Pay stub:");
		System.out.println("Last Name: " + lastName);
		System.out.println("First Name: " + firstName);
		System.out.println("Regular Hours: " + regHours);
		System.out.println("Overtime Hours: " + overHours);
		System.out.println("Regular Hourly Rate: " + hourRate);

		System.out.println("Base Pay For Regular and Overtime Hours: " + dform.format(finalPay3));
		System.out.println("Bonus: " + finalPay4);
		System.out.println("Final pay for this week: " + dform.format(finalPay5));
	}
}
