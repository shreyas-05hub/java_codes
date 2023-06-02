// WAP to print square of even digits of given no

class square{
	public static void main(String[] args){
		int n=942111423;

		while(n!=0){
			int rem =n%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			n=n/10;
		}
	}
}
