//WAP to count the odd Digits of no 

class odd{
	public static void main(String[] s){
		int n=94211423;
		int count=0;

		while(n!=0){
			int rem=n%10;
			if(rem%2==1){
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
