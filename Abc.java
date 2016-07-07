class Abc
{
	public static void kiran()
	
	{
		String[] args = new String[]("kiran");
		AbcXyz.main(args);	
		System.out.println("Good Afternoon Kiran");
	}
}

class Xyz
{
	public static void kiran()
	
	{
		System.out.println("Good Afternoon Xyz");
	}
}


class AbcXyz
{
	public static void main(String args[])
	
	{
		System.out.println("Good Afternoon coomons");
		Xyz.kiran();
		Abc.kiran();
	}
}
