import java.util.*;
class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int N =sc.nextInt();

		int arr[]=new int[N];

		int ecount=0,ocount=0;
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				ecount++;
			}else{
				ocount++;
			}
		}
		System.out.println("Even:" +ecount);
		System.out.println("Odd:" +ocount);
	}
}
