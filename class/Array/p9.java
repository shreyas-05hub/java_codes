import java.util.*;
class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int N=sc.nextInt();
		
		int  arr[] = new int[N];
		int product=1;
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				product=product*arr[i];	
			}
		}
		System.out.println(product);
	}
}
