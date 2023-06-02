import java.util.*;
class P5{
	public static void main(String[] args){
		Scanner  Sc = new Scanner(System.in);
		int arr[] =new int[5];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Sc.nextInt();
		}
		System.out.println("Elements are:");
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}
