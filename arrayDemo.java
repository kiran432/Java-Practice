class Emp
{
	String name;
}

public class arrayDemo
{
	public static void main(String args[])
	{
		int a[];
		int[] b;
		int[] c = new int[5]; 
		int arr[] = {1,2,3,5,6,7,87,8};
		for (int i = 0; i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
		
		System.out.println("==================");	
		for (int x: arr)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------");
		Emp emp[] = new Emp[5];
		for (Emp x:emp){
			x = new Emp();
			System.out.println(x);	
		}
		for (int i = 0; i < emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}
}