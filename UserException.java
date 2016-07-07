public class UserException extends Exception
{
	public UserException()
	{

	}
	public UserException(String msg)
	{
		super(msg);
	}
	public void display()
	{	
		System.out.println("Coming from User defined exception handler...");
	}	

}