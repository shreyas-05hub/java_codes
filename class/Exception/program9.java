import java.io.*;
class p9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		int data = 0;
		try{       
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
			System.out.println("Please Enter Integer Value");
			data = Integer.parseInt(br.readLine());
		}
		System.out.println(data);

	}
}
