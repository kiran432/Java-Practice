class Inheritsub{
	int amount;
	public void print()
	{
		System.out.println("value of amount in parent class: " + amount);
	}
}
 public class Inherit extends Inheritsub{
	
	int amount;
	int key = 12;
	public static void main(String[] args)
	{
	super();
	Inheritsub obj = new Inherit();
	obj.amount = 10;
	obj.key = 200;
	obj.print();
	}	
}

