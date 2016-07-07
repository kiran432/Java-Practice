import java.util.*;
import java.io.*;	

public class GrepSearch{

	public static void main(String args[])
	{
		System.out.println(args.length);
		if(args.length != 2)
			System.out.println("Provide filename and keyword");
		else
		{
			String filename = args[0];
			String searchWord = args[1];
			try{
			findLine(searchWord, filename);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	
		
	}
	
public static void findLine(String searchWord, String filename) throws IOException
 {
    int count = 0;
    BufferedReader br = new BufferedReader(new FileReader(filename));
    String line;
    while( (line = br.readLine( )) != null)
        {
            if (line.indexOf(searchWord) != -1)
                {
                    count++;
                    System.out.println(line);
                }
        }
    System.out.println(count + " matching line(s) found.");
    br.close( );
 }
 
}