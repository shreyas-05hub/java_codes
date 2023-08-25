import java.util.*;
import java.io.*;

class PD{
	public static void main(String[] args)throws IOException{
		Properties obj = new Properties();
		FileInputStream fobj = new FileInputStream("Friends.properties");

		obj.load(fobj);
		String name = obj.getProperty("Amol");
		System.out.println(name);
		obj.setProperty("Shashi","Biencaps");

		FileOutputStream outobj =  new FileOutputStream("Friends.properties");
		obj.store(outobj,"Updated by Shreyas");
	}
}
