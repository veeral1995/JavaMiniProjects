import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class RewardsMember
	{
		int rewardsMemberID, rewardsBalance, Age, customerStatus;
		long SSN;
		String Address, Name, phoneNumber;

	public void Person () //Constructor
	{
		rewardsMemberID = 0;
		rewardsBalance = 0;
	}

	public void populateRewardsMember (String namex, String addressx, int Agex, String phoneNumberx, long SSNx, int customerStatusx, int rewardsMemberIDx, int rewardsBalancex)
	{
		Name = namex;
		Address = addressx;
		Age = Agex;
		phoneNumber = phoneNumberx;
		SSN = SSNx;
		customerStatus = customerStatusx;
		rewardsMemberID = rewardsMemberIDx;
		rewardsBalance = rewardsBalancex;
	}

	public void rentSUV (String Make, String Model, double costPerDay)
	{
		rewardsBalance = 100;
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public void rentSpecialty (String Make, String Model, double costPerDay)
	{
		rewardsBalance = 100;
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public void rentMiniVan (String Make, String Model, double costPerDay)
	{
		rewardsBalance = 100;
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public void rentSedan (String Make, String Model, double costPerDay)
	{
		rewardsBalance = 100;
		System.out.println(Name + " is renting " + Make + " , " + Model + " while paying this amount daily: " + costPerDay);
	}

	public int returnBalance ()
	{
		return rewardsBalance;
	}

	}

