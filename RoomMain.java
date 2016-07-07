class Room{
	int length;
	int width;
	public void area()
	{
	//	this();		
		System.out.println("Area: " +this+  (length*width));
	}
	Room()
	{
		length = 10;
		width = 20;
	}
	Room(int len, int wid)
	{
		length = len;
		width = wid;
		return;
	}
	
}
public class RoomMain{

	public static void main(String[] args)
	{
		Room r1;
		r1 = new Room();r1 = new Room();r1 = new Room();r1 = new Room();r1 = new Room();r1 = new Room();
		r1.area();
		Room r2 = new Room(400,500);
		r1.area();
		r2.area();

		r1 = r2;
		r1.length = 40;
		r2.width = 50;
		r1.area();
		r2.area();
	}
}