import java.util.*;
import java.io.*;

public class dircompareclass{

	Hashtable has =  new Hashtable();
	public void createhashlist(String filename)
	{
		Hashtable has =  new Hashtable();
		File fo =  new File(filename);
		String[] children = fo.list();
            for (int i=0; i<children.length; i++){
				has.put(children[i].hashCode(), children[i]);
				//System.out.println(children[i]);
			}
			Enumeration names = has.keys();
			while(names.hasMoreElements()) {
			int str = (Integer)names.nextElement();
			System.out.println(str + ": " +
			has.get(str));
			}

	}
	
	 public void walk( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();
        
		if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
              //  System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            else {
                //System.out.println( "File:" + f.getAbsoluteFile() );
				has.put(f.hashCode(), f.getName());
			}
        }
    }
	public void disp()
	{
		Enumeration names = has.keys();
			while(names.hasMoreElements()) {
			int str = (Integer)names.nextElement();
			System.out.println(str + ": " +
			has.get(str));
			}
		
		
	}

	public void check(String filename)
	{
		File root = new File( filename );
        File[] list = root.listFiles();
		
		if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                check( f.getAbsolutePath() );
              //  System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            else {
             /*   System.out.println( "File:" + f.getName());
				System.out.println(has.containsValue(f.getName()));*/
				boolean ret = has.containsValue(f.getName());
				if(ret == true)
					System.out.println(f.getAbsolutePath()+"\t\t\t" + "  exits at target");
				else	
					System.out.println(f.getAbsolutePath()+"\t\t\t" + " doesn't exist at target");
			}	
        }
	}
	public static void main(String args[])
	{
		dircompareclass dr = new dircompareclass();
		dr.walk("c:\\users\\gadamk\\Desktop");
//		dr.disp();
		dr.check("c:\\users\\gadamk\\test");
	}
}