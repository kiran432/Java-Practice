import java.util.Scanner;
public class KeyDemo
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Entre name: ");
		String name = sc.next();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		System.out.println("Enter Designation: ");
		String desig = sc.next();
		System.out.println("Enter salary:");
		int salary = sc.nextInt();
		System.out.println("Name is : "+ name);
		System.out.println("your age:" + age);
		System.out.println("Designation is : "+ desig);
		System.out.println("Salary:" + salary);
	}

}