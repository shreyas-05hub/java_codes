//Take n input  print all factors

class factor{
	public static void main(String[] s){
		int n=6;

		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.println(i);
		}
	}
}
