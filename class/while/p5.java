//Given an integer 
//print all digits
//input 6351

class digit{
	public static void main(String[] args){
		int n=6351;
		
		while(n!=0){
			System.out.println(n%10);
			n=n/10;
		}
	}
}
