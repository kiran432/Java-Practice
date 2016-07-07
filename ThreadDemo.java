class A extends Thread
{
	public void run()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println("i = "+i);
			try
			{
				if(i%3==0)
					Thread.sleep(7000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1; j<=20; j++)
		{
			System.out.println("j = "+j);
			try
			{
				if(j%2==0)
					Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1; k<=20; k++)
		{
			System.out.println("k = "+k);
		}
	}
}

public class ThreadDemo
{
	public static void main(String args[]) throws Exception
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		//a1.setDaemon(true);

		a1.start();
		b1.start();
		c1.start();

		a1.setName("abc");
		b1.setPriority(8);

		System.out.println(a1);		// [ ThreadName, Priority, ParentThread ]
		System.out.println(b1);
		System.out.println(c1);
		Thread m1 = Thread.currentThread();
		System.out.println(m1);

		System.out.println("a1 is daemon : "+a1.isDaemon());
		System.out.println("b1 is daemon : "+b1.isDaemon());
		System.out.println("c1 is daemon : "+c1.isDaemon());

		System.out.println("a1 is alive : "+a1.isAlive());
		System.out.println("b1 is alive : "+b1.isAlive());
		System.out.println("c1 is alive : "+c1.isAlive());

		/*for(int i=1; i<=200; i++)	
		{
			System.out.print(i+"   ");
			if(i==20)
				b1.suspend();
			if(i==150)
				b1.resume();
			if(i==50)
				a1.stop();
			if(i==100)
				a1.resume();
			if(i==80)
				a1.start();
			Thread.sleep(300);
		}*/

		a1.join();
		c1.join();
		b1.join();

		System.out.println("a1 is alive : "+a1.isAlive());
		System.out.println("b1 is alive : "+b1.isAlive());
		System.out.println("c1 is alive : "+c1.isAlive());

		System.out.println("Main Exit");
	}
}