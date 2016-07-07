import java.util.*;

class Emp
{
	private String name;
	private int age;
	public Emp(String n, int a)
	{
		name = n;
		age = a;
	}
	public String toString()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		return "";
	}
	public String getName()
	{	
		return name;
	}
	public int getAge()
	{	
		return age;
	}
}
class NameSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Emp e1 = (Emp) obj1;
		Emp e2 = (Emp) obj2;

		String n1 = e1.getName();
		String n2 = e2.getName();

		return n1.compareTo(n2);
	}
}
class AgeSorter implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Emp e1 = (Emp) obj1;
		Emp e2 = (Emp) obj2;

		Integer i1 = e1.getAge();
		Integer i2 = e2.getAge();

		return i1.compareTo(i2);
	}
}
public class CollectionDemo
{
	public static void main(String args[])
	{
		TreeSet<Emp> obj = new TreeSet<Emp>(new AgeSorter());

		obj.add(new Emp("Raj", 41));
		obj.add(new Emp("Suraj", 29));
		obj.add(new Emp("Dheeraj",25));
		obj.add(new Emp("Manoj", 32));

		Iterator<Emp> i = obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}