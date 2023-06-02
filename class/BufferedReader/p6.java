import java.io.*;
import java.util.*;
class Society{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Society,Wing,FlatNO");
		String Info = br.readLine();

		StringTokenizer obj = new StringTokenizer(Info,",");

		String Token1 = obj.nextToken();
		String Token2 = obj.nextToken();
		String Token3 = obj.nextToken();

		System.out.println("Society Name:" +Token1);
		System.out.println("Wing:" +Token2);
		System.out.println("Flat No:" +Token3);
	}
}
