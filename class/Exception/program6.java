import java.io.*;
class p6{
	void getData()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int data=0;
		try{
		       	data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){

		}
		System.out.println(data);
	}
	public static void main(String[] args)throws IOException{
		p6 obj = new p6();
		obj.getData();
	}
}
