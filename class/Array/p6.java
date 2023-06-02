import java.io.*;
class P6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum=arr[i] +sum;
		}
		System.out.println("sum:" +sum);
	}
}
