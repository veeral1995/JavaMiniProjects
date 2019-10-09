import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

// Veeral Patel CISC 230 Library Assignment
public class Library
{
		public static Book book1 = new Book();
		public static Book book2 = new Book();
		public static Book book3 = new Book();
		public static Book book4 = new Book();
		public static Book book5 = new Book();

	public static void main(String[] args)
	{
		String title1, title2, title3, title4, title5;
		String author1, author2, author3, author4, author5;
		String callNumber1, callNumber2, callNumber3, callNumber4, callNumber5;
		int status1, status2, status3, status4, status5, i;
		int ISBN1, ISBN2, ISBN3, ISBN4, ISBN5;
		int returned, lost, damaged, checkout, book, num;

		ArrayList books = new ArrayList();

		books.add("Java Demystified"); //0
		books.add("Moral Prey"); //1
		books.add("Design patterns for object-orientated software development"); //2
		books.add("Nemesis"); //3
		books.add("Stranger in a Strange Land"); //4



		Scanner keyboard = new Scanner (System.in);

		book1.populateBook(1, 2, "Java Demystified", "Jim Keogh", "005.133 J32");
		title1 = book1.getTitleName();
		author1 = book1.getAuthorName();
		status1 = book1.getStatus();
		ISBN1 = book1.getISBN();
		callNumber1 = book1.getCallNumber();

		book2.populateBook(2, 1, "Moral Prey", "John Sandford", "Fic Sa5");
		title2 = book2.getTitleName();
		author2 = book2.getAuthorName();
		status2 = book2.getStatus();
		ISBN2 = book2.getISBN();
		callNumber2 = book2.getCallNumber();

		book3.populateBook(3, 2, "Design patterns for object-orientated software development", "Wolfgang Pree", "005.12 P91");
		title3 = book3.getTitleName();
		author3 = book3.getAuthorName();
		status3 = book3.getStatus();
		ISBN3 = book3.getISBN();
		callNumber3 = book3.getCallNumber();

		book4.populateBook(4, 2, "Nemesis", "Isaac Asimov", "SF As4");
		title4 = book4.getTitleName();
		author4 = book4.getAuthorName();
		status4 = book4.getStatus();
		ISBN4 = book4.getISBN();
		callNumber4 = book4.getCallNumber();

		book5.populateBook(5, 1, "Stranger in a Strange Land", "Robert Heinlein", "SF H36");
	    title5 = book5.getTitleName();
		author5 = book5.getAuthorName();
		status5 = book5.getStatus();
		ISBN5 = book5.getISBN();
		callNumber5 = book5.getCallNumber();

		books.add(1, book1);
		books.add(3, book2);
		books.add(5, book3);
		books.add(7, book4);
		books.add(9, book5);

		System.out.println(books); //MAIN INFO



		System.out.println();

		System.out.println(" Please Select One Of The Following Options: ");
		System.out.println();
		System.out.println("1 = Find By ISBN #");
		System.out.println("2 = Check Out A Book");
		System.out.println("3 = Return A Book");
		System.out.println("4 = Report A Book As Lost");
		System.out.println("5 = Report A Book As Damaged");
		System.out.println("6 = Quit");
		System.out.println();
		i = keyboard.nextInt();

		while(i >= 6 && i<=0)
		{
		System.out.println(" Please Select One Of The Following Options: ");
		System.out.println();
		System.out.println("1 = Find By ISBN #");
		System.out.println("2 = Check Out A Book");
		System.out.println("3 = Return A Book");
		System.out.println("4 = Report A Book As Lost");
		System.out.println("5 = Report A Book As Damaged");
		System.out.println("6 = Quit");
		System.out.println();
		i = keyboard.nextInt();
		}
		  if (i == 1)
			{
				System.out.println("Enter ISBN Of Book To Find");
				book = keyboard.nextInt();
				getBookLocation(book);
			}
			if (i == 2)
			{
				System.out.println("Enter ISBN Of Book To Check Out:");
				checkout = keyboard.nextInt();
				bookCheckOut(checkout);
			}
			if (i == 3)
			{
				System.out.println("Enter ISBN Of Book To Check In:");
				returned = keyboard.nextInt();
				bookCheckIn(returned);
			}
			if (i == 4)
			{
				System.out.println("Enter ISBN Of Lost Book:");
				lost = keyboard.nextInt();
				bookLost(lost);
			}
			if (i == 5)
			{
				System.out.println("Enter ISBN Of Damaged:");
				damaged = keyboard.nextInt();
			}
	}

	static void bookCheckOut (int num)
		{
			if (num == 1)
			{
					System.out.println("The Book Has Been Checked Out!");
					book1.checkOut();
					System.out.println(book1.getStatus());
			}
			else if (num == 2)
			{
					System.out.println("The Book Has Been Checked Out!");
					book2.checkOut();
					System.out.println(book2.getStatus());
			}
			else if (num == 3)
			{
					System.out.println("The Book Has Been Checked Out!");
					book3.checkOut();
					System.out.println(book3.getStatus());
			}
			else if (num == 4)
			{
					System.out.println("The Book Has Been Checked Out!");
					book4.checkOut();
					System.out.println(book4.getStatus());
			}
			else if (num == 5)
			{
					System.out.println("The Book Has Been Checked Out!");
					book5.checkOut();
					System.out.println(book5.getStatus());
			}
			else
			{
					System.out.println("Invalid Entry");
			}
		}

	static void bookLost (int num)
		{
			if (num == 1)
			{
					System.out.println("The Book Has Been Reported As Lost!");
					book1.reportLost();
					System.out.println(book1.getStatus());
			}
			else if (num == 2)
			{
					System.out.println("The Book Has Been Reported As Lost!");
					book2.reportLost();
					System.out.println(book2.getStatus());
			}
			else if (num == 3)
			{
					System.out.println("The Book Has Been Reported As Lost!");
					book3.reportLost();
					System.out.println(book3.getStatus());
			}
			else if (num == 4)
			{
					System.out.println("The Book Has Been Reported As Lost!");
					book4.reportLost();
					System.out.println(book4.getStatus());
			}
			else if (num == 5)
			{
					System.out.println("The Book Has Been Reported As Lost!");
					book5.reportLost();
					System.out.println(book5.getStatus());
			}
			else
			{
					System.out.println("Invalid Entry");
			}
		}

	static void bookCheckIn (int num)
		{
			if (num == 1)
			{
					System.out.println("The Book Has Been Checked In!");
					book1.checkOut();
					System.out.println(book1.getStatus());
			}
			else if (num == 2)
			{
					System.out.println("The Book Has Been Checked In!");
					book2.checkIn();
					System.out.println(book2.getStatus());
			}
			else if (num == 3)
			{
					System.out.println("The Book Has Been Checked In!");
					book3.checkIn();
					System.out.println(book3.getStatus());
			}
			else if (num == 4)
			{
					System.out.println("The Book Has Been Checked In!");
					book4.checkIn();
					System.out.println(book4.getStatus());
			}
			else if (num == 5)
			{
					System.out.println("The Book Has Been Checked In!");
					book5.checkIn();
					System.out.println(book5.getStatus());
			}
			else
			{
					System.out.println("Invalid Entry");
			}
		}

	static void bookDamaged (int num)
		{
			if (num == 1)
			{
					System.out.println("The Book Has Been Reported As Damaged!");
					book1.reportDamaged();
					System.out.println(book1.getStatus());
			}
			else if (num == 2)
			{
					System.out.println("The Book Has Been Reported As Damaged!");
					book2.reportDamaged();
					System.out.println(book2.getStatus());
			}
			else if (num == 3)
			{
					System.out.println("The Book Has Been Reported As Damaged!");
					book3.reportDamaged();
					System.out.println(book3.getStatus());
			}
			else if (num == 4)
			{
					System.out.println("The Book Has Been Reported As Damaged!");
					book4.reportDamaged();
					System.out.println(book4.getStatus());
			}
			else if (num == 5)
			{
					System.out.println("The Book Has Been Reported As Damaged!");
					book5.reportDamaged();
					System.out.println(book5.getStatus());
			}
			else
			{
					System.out.println("Invalid Entry");
			}
		}

	static void getBookLocation (int num)
		{
			if (num == 1)
			{
					System.out.println("The Book Is Located At: 005.133 J32");
			}
			else if (num == 2)
			{
					System.out.println("The Book Is Located At: Fic Sa5 ");
			}
			else if (num == 3)
			{
					System.out.println("The Book Is Located At: 005.12 P91 ");
			}
			else if (num == 4)
			{
					System.out.println("The Book Is Located At: SF As4");
			}
			else if (num == 5)
			{
					System.out.println("The Book Is Located At: SF H36");
			}
			else
			{
					System.out.println("Invalid Entry");
			}
		}
}

