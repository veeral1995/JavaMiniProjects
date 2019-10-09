import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class PeriodPay
{
	// This program will generate the PeriodPay-Taxes
	// Generated by Veeral Patel, CISC230

	public static void main(String[] args)
	{
		Random randomNum = new Random();
		DecimalFormat dform = new DecimalFormat ("0.##");
		Scanner keyboard = new Scanner(System.in);

		String firstName, lastName;
		int healthPlan;
		double yearPay, periodGrossPay, FICA, fedTax, stateTax, fedTax1, stateTax1, fedTax2, stateTax2;
		double deduction;


		System.out.println("Welcome to our Payroll System");
		System.out.println("We Will Calculate Many Things Based On Yearly Salary");
		System.out.println();

		System.out.println("Please Enter Your First Name");
		firstName = keyboard.nextLine();
		System.out.println();

		System.out.println("Please Enter Your Last Name");
		lastName = keyboard.nextLine();
		System.out.println();

		System.out.println("What Is Your Yearly Salary");
		yearPay = keyboard.nextDouble();
		System.out.println();

		if (yearPay > 150000)
		{
			System.out.println("Your Taxes Will Be Going Up This Year.");
		}

		periodGrossPay = yearPay/26.0;
		FICA = periodGrossPay*.07;
		fedTax = periodGrossPay*.05;
		stateTax = periodGrossPay*.03;
		fedTax1 = periodGrossPay*.08;
		stateTax1 = periodGrossPay*.04;
		fedTax2 = periodGrossPay*.1;
		stateTax2 = periodGrossPay*.05;
		deduction = periodGrossPay;
		//System.out.println("After FICA, This Pay Period You Will Earn: " + (periodGrossPay-FICA));
		System.out.println();

		if ( yearPay < 40000)
		{
			//System.out.println("After Fed and State Tax, You Will Be Deducted " + (fedTax+stateTax));
			deduction = deduction - (fedTax+stateTax+FICA);
		}

		if ( yearPay >= 40000 && yearPay < 150000)
		{
			//System.out.println("After Fed and State Tax, You Will Be Deducted " + (fedTax1+stateTax1));
			deduction = deduction - (fedTax1+stateTax1+FICA);
		}

		if ( yearPay >=150000)
		{
			//System.out.println("After Fed and State Tax, You Will Be Deducted " + (fedTax2+stateTax2));
			deduction = deduction - (fedTax2+stateTax2+FICA);
		}

		System.out.println("Which Health Plan do You Have (1-3)?");
		healthPlan = keyboard.nextInt();
		System.out.println();

		switch (healthPlan)
		{
			case 1:
				System.out.println("$300 Will Be Deducted");
				deduction = deduction-300;
				break;
			case 2:
				System.out.println("$200 Will Be Deducted");
				deduction = deduction-200;
				break;
			case 3:
				System.out.println("$100 Will Be Deducted");
			default:
				System.out.println("Invalid Entry");
				deduction = deduction-100;
				break;
		}

		System.out.println();
		System.out.println("Your Name: " + firstName + " " + lastName);
		System.out.println("Your Yearly Pay = " + yearPay);
		System.out.println("Your Gross Period Pay = " + periodGrossPay);
		System.out.println("Your Period Pay W/ FICA = " + (periodGrossPay-FICA));
		System.out.println("Your Period Pay W/ FICA, State & Fed Tax, Health Insurance = " + deduction);


	}
}

