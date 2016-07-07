public class stringtest{

public static void main(String args[])
{
	String kiran = "kiran@!@#0-123!@";
	System.out.println(kiran.replaceAll("[^a-zA-Z0-9 - _]", ""));

}
}