import java.util.*;

class PD{
	public static void main(String[] args){
		Properties obj = new Properties();
		FileInputStream fobj = new FileInputStream("Friends.properties");

		obj.load(fobj);
		String name = obj.getProperty("Amol");
		System.out.println(name);
	}
}
