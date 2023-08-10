//WAP which takes no from user if no is even print that no in reverse order or if no is odd print that no in reverse order by diff of 2

class user{
	public static void main(String[] args){
		int n=7;
		
		if(n%2==0){
			while(n!=0){
				System.out.println(n);
				n--;
			}
		}else{
			while(n!=0){
				System.out.println(n);
				n=n-2;
			}
		}
	}
}
