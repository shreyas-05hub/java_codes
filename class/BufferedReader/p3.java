import java.io.*;
class Society{
	public static void main(String[] s)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Society Name");
		String name =br.readLine();

		System.out.println("Enter Wing");
		char wing =(char)br.read();
		br.skip(1);
		
		System.out.println("Enter Flat No");
		int flat = Integer.parseInt(br.readLine());

		System.out.println(name);
		System.out.println(wing);
		System.out.println(flat);
	}
}
