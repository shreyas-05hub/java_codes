// Take an int n as input 
// Print perfect squares till n
// prefect square:print whose square root is an int

class square{
	public static void main(String[] args){
		int n=30;
		int i=1;

		while(i*i<=n){
			System.out.println(i*i);
			i++;
		}
	}
}
