import java.io.*;
class Playerinfo{
	public static void main(String[] s)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Name");
		String name1 = br.readLine();

		System.out.println("Enter Jersey No");
		int jerno = Integer.parseInt(br.readLine());

		System.out.println("Enter Avg");
		float avg =Float.parseFloat(br.readLine());

		System.out.println(name1);
		System.out.println(jerno);
		System.out.println(avg);

	}
}
