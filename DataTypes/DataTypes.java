import java.util.Random;
import java.text.NumberFormat;

public class DataTypes
{
public static void main(String[] args)
	{
	 byte testByte0=111, testByte1=123, resultByte=0;
	 short testShort0=1111, testShort1=2222, resultShort=0;
	 int testInt0=1111111, testInt1=2222222, resultInt=0;
	 long testLong0=1111111, testLong1=2222222, resultLong=0;

	 float testFloat0=1111111, testFloat1=2222222, resultFloat=0;
	 float testFloat2=1.0E6F, testFloat3=2.0E6F;
	 float testFloat4=127.3F, testFloat5=99.9f;

	 double testDouble0=1.0E10, testDouble1=2.0E10, resultDouble=0;

	 System.out.println();
	 System.out.println("This example isllustrates the use of primitive data types");
	 System.out.println();

	 resultInt=testByte0+testByte1;
	 System.out.println("Result of adding the first two resultBytes is: " + resultInt);
	 System.out.println();

	 resultInt=testShort1*testShort0;
	 System.out.println("Result of multiplying testShorts is " + resultInt);
	 System.out.println();

	 resultInt=testInt0+testInt1;
	 System.out.println("Result of adding testInt's is " + resultInt);
	 System.out.println();

	 resultInt=testInt1*testInt0;
	 System.out.println("Result of multiplying 2 testInt's is " + resultInt);
	 System.out.println();

	 resultLong=(long)testInt1*(long)testInt0;
	 System.out.println("Result of multiplying 2 testInt's to an int is " + resultLong);
	 System.out.println();

	 resultFloat=testFloat0*testFloat1;
	 System.out.println("Result of multiplying 2 testFloats is " + resultFloat);
	 System.out.println();

	 resultDouble=testDouble0*testDouble1;
	 System.out.println("Result of multiplying 2 testDoubles is " + resultDouble);
	 System.out.println();
	}
}
