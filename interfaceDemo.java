interface X{
	int a = 50;
	void add();
	void sub();
}

interface Y{
	int b = 10;
	void mul();
	void div();
	int a = 60;
}

interface Z extends X,Y
{
	

}
class Calculator implements Z
{
	public void sub()
	{
		System.out.println(X.a - Y.b);
	}
	public void add()
	{
		System.out.println(Z.a + X.a);
	}
	public void mul(){
	}
	public void div(){
	}
}