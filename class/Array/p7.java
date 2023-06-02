import java.util.*;
class P7{
	public static void main(String[] args){
		Scanner Sc=new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size = Sc.nextInt();

		int arr[] = new int[size];
		int count=0;
		for(int i=0;i<size;i++){
			arr[i]=Sc.nextInt();
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
