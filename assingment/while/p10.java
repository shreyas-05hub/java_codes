//WAP to check whether the no is palindrome or not 


class palindrome{
	public static void main(String[] args){
		int n=2332;
		int i=n;
		int sum=0;

		while(n!=0){
			int rm=n%10;
			sum=sum*10+n;
			n=n/10;
		}
		if(sum==i){
			System.out.println("it is palindrome no");
		}else {
			System.out.println("it is not palindrome no");
		}
	}
}
