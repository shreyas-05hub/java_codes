import java.io.*;
import java.util.*;
class Ipl{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("MatchInfo,Man of the Match & Runs:");
		String str = br.readLine();

		StringTokenizer obj = new StringTokenizer(str,",");
		
		String Token1 = obj.nextToken();
		String Token2 = obj.nextToken();
		String Token3 = obj.nextToken();
		
		System.out.println("MatchInfo:" +Token1);
		System.out.println("Man of the Match:" +Token2);
		System.out.println("Runs:" +Token3);		
	}
}
