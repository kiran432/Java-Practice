public class HandlingException
{
	public static void main(String Args[])
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println(i);
			if(i == 10)
				throw new UserException();
		}
	}
}