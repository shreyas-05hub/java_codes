import java.io.*;
class Input{
	
	public static void main(String[] s)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter batsman name");
		String name = br.readLine();


		System.out.println("Enter bowler name");
		String bowler =	br.readLine();

		System.out.println("Batsman name is "+name);
		System.out.println("Bowler name is "+bowler);
	}
}
