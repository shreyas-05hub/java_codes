import java.io.*;
import java.util.*;
class Building{
	public static void main(String[] args)throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Society Name,Wing,FlatNo,Price");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info,".");

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();
		String token4 = obj.nextToken();

		String Society = token1;
		char wing = token2.charAt(0);
		int flat = Integer.parseInt(token3);
		float price = Float.parseFloat(token4);
		
		System.out.println("SOciety Name:" +Society);
		System.out.println("Wing:" +wing);
		System.out.println("Flat No:" +flat);
		System.out.println("Price:" +price);	
	}
}
