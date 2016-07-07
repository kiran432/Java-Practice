
import java.io.*;

class Abc
{
	public int demo() throws ArithmeticException, IOException, NullPointerException
	{
			int a = 50;
			for(int i=1; i<=20; i++)		
			{
				System.out.println(i);
				int res = a/(a-i);
				if(i==15)
					throw new IOException();
				if(i==12)
					throw new NullPointerException();
				if(i==10)
					throw new ArrayIndexOutOfBoundsException();
			}
		return 420;
	}
	public void xyz() throws ArithmeticException, IOException, NullPointerException
	{
		int result = demo();
		System.out.println("Result : "+result);
	}
	public void atoz() throws ArithmeticException, IOException, NullPointerException
	{
		xyz();
	}
}
public class ExceptionDemo
{
	public static void main(String args[]) throws ArithmeticException, IOException, NullPointerException
	{
		try
		{
			Abc a1 = new Abc();
			a1.atoz();
		}
		catch(IOException ioe)
		{
			System.out.println("IO Exception occured....");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occured....");
		}
		catch(Exception e)
		{
			System.out.println("Default Exception handler....");
		}
		finally
		{
			System.out.println("Thank you....");
		}
	}
}