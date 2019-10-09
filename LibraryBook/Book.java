import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

// Veeral Patel CISC 230 Library Assignment
public class Book
	{
		int ISBN, status;
		String title, author, callNumber;

	public Book () //Constructor
	{
		ISBN = 0;
		status = 0;
		title = "XXXXX";
		author = "XXXXX";
		callNumber = "XXXXX";
	}

	public void populateBook(int ISBNnum, int Status, String Title, String Author, String CallNumber)
	{
		ISBN = ISBNnum;
		status = Status;
		title = Title;
		author = Author;
		callNumber = CallNumber;

	}

	public int getISBN ()
	{
		return ISBN;
	}
	public int getStatus ()
	{
		return status;
	}
	public String getTitleName ()
	{
		return title;
	}
	public String getAuthorName ()
	{
		return author;
	}
	public String getCallNumber ()
	{
		return callNumber;
	}
	public String toString ()
	{

		String info = "_______";
		info += "This current information on book: \n\n";
		info += "The book name is " + title + "\n";
		info += "The author is " + author + "\n";
		info += "The call number is " + callNumber + "\n";
		info += "The status is " + status + "\n";
		info += "The ISBN is " + ISBN + "\n";

		return info;
	}



	public void checkOut()
	{
		status = 2;

	}

	public void checkIn()
	{
		status = 3;
	}

	public void reportLost ()
	{
		status = 4;
	}

	public void reportDamaged ()
	{
		status = 5;
	}

}

