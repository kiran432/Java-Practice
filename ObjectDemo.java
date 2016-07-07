class Abc implements Cloneable
{
	int x;
	public String toString()
	{
		return "Abc object with value of x : "+x;
	}
	public Abc clone()
	{
		try
		{
			return (Abc)super.clone();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public void finalize()
	{
		System.out.println("Object with value of x : "+x+" getting deleted....");
	}
}
class Xyz
{
	public String toString()
	{
		return "Its Xyz class object";
	}
}
class Atoz
{
	public String toString()
	{
		return "Its Atoz class object";
	}
}
public class ObjectDemo
{
	public static void main(String args[]) throws Exception
	{
		Abc a1 = new Abc();
		a1.x = 10;

		Abc a2 = new Abc();
		a2.x = 50;

		Abc a3 = a1.clone();
		a1.x = 100;

		/*System.out.println(a1.equals(a2));
		System.out.println(a1);	
		System.out.println(a2);	
		System.out.println(a3);	

		Class c1 = a3.getClass();
		System.out.println("a3 is object of class : "+c1.getName());

		Class c2 = Class.forName(args[0]);
		Object obj = c2.newInstance();
		System.out.println(obj); 

		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1.hashCode());	
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);	

		s2 = s2.toUpperCase();
		System.out.println(s2);		

		StringBuffer sb = new StringBuffer("hi");
		sb.append("hello");
		System.out.println(sb);*/

		System.out.println(a1);	
		System.out.println(a2);	
		System.out.println(a3);

		System.out.println("---------------------");

		a1 = null;
		a2 = null;
		a3 = null;

		System.gc();
	}
}