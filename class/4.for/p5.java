//print count of factors

class count{
	public static void main(String[] s){
		int n=6;
		int count=0;

		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;
		}
		System.out.println(count);
	}

}
