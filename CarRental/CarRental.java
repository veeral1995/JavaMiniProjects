import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

// Veeral Patel CISC 230 CarRental Assignment
public class CarRental
{


	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner (System.in);

		Sedan economy1 = new Sedan ();
		Sedan compact1 = new Sedan ();
		Sedan midsize1 = new Sedan ();
		Sedan fullsize1 = new Sedan ();
		Specialty truck1 = new Specialty ();
		Specialty sports1 = new Specialty ();
		SUV suv1 = new SUV ();
		MiniVan minivan1 = new MiniVan();
		CarEmployee empl1 = new CarEmployee();
		RewardsMember rewards1 = new RewardsMember();
		CarRegular reg1 = new CarRegular();

		String make1, make2, make3, make4, make5, make6, make7, make8;
		String model1, model2, model3, model4, model5, model6, model7, model8;
		double costPerDay1, costPerDay2, costPerDay3, costPerDay4, costPerDay5, costPerDay6, costPerDay7, costPerDay8;
		String nombre;



		economy1.populateSedan(1231, "Chevrolet", "Aveo", 2009, "Deluxe", 23456, 35, 4, 3, 1, 1, 20.50);
		make1 = economy1.getMake();
		model1 = economy1.getModel();
		costPerDay1 = economy1.getCostPerDay();


		compact1.populateSedan(1232, "Nissan", "Sentra", 2010, "GLX", 11456, 30, 5, 4, 1, 2, 22.50);
		make2 = compact1.getMake();
		model2 = compact1.getModel();
		costPerDay2 = compact1.getCostPerDay();


		midsize1.populateSedan(1233, "Pontiac", "G5", 2010, "XL", 84512, 20, 5, 4, 1, 3, 30.00);
		make3 = midsize1.getMake();
		model3 = midsize1.getModel();
		costPerDay3 = midsize1.getCostPerDay();


		fullsize1.populateSedan(1234, "Chevrolet", "Impala", 2009, "GL", 24500, 22, 5, 5, 1, 4, 32.50);
		make4 = fullsize1.getMake();
		model4 = fullsize1.getModel();
		costPerDay4 = fullsize1.getCostPerDay();


		truck1.populateSpecialty(1235, "Chevrolet", "Silverado", 2010, "Super", 12863, 20, 6, 5, 1, 1, 35.00);
		make5 = truck1.getMake();
		model5 = truck1.getModel();
		costPerDay5 = truck1.getCostPerDay();


		sports1.populateSpecialty(1236, "Chevrolet", "Corvette", 2010, "XL", 9898, 10, 2, 2, 1, 2, 35.00);
		make6 = sports1.getMake();
		model6 = sports1.getModel();
		costPerDay6 = sports1.getCostPerDay();


		suv1.populateSUV(1237, "Ford", "Escape", 2009, "ZZ", 79263, 20, 6, 4, 1, 36.00);
		make7 = suv1.getMake();
		model7 = suv1.getModel();
		costPerDay7 = suv1.getCostPerDay();


		minivan1.populateMiniVan(1238, "Toyota", "Sienna", 2009, "XL", 71926, 25, 8, 4, 1, 36.00);
		make8 = minivan1.getMake();
		model8 = minivan1.getModel();
		costPerDay8 = minivan1.getCostPerDay();


		empl1.populateCarEmployee("George Shockly", "111 Summit Ave St Paul MN", 55, "6514443333", 123456789, 4321, "Mechanic", 50);
		nombre = empl1.getName();

		rewards1.populateRewardsMember("Sarah Peterson", "222 Summit Ave St Paul MN", 32, "7633331111", 123567811, 1, 1122, 20000);


		reg1.populateCarRegular("Jill Trent", "333 Summit Ave St Paul MN", 41, "6512228888", 124356789, 2);



		//rentSedan(make1, model1, costPerDay1);
		//rentSedan(make2, model2, costPerDay2);
		//rentSpecialty(make6, model6, costPerDay6);
		//rentSUV(make7, model7, costPerDay7);

		rewards1.rentSedan(make1, model1, costPerDay1);
		rewards1.rentSedan(make3, model3, costPerDay3);
		rewards1.rentSpecialty(make6, model6, costPerDay6);
		rewards1.rentSUV(make7, model7, costPerDay7);


}
}