// A B C D
// A B C
// A B
// A

class p19{
	public static void main(String[] args){
		int n =4;
		for(int i=1;i<=n;i++){
	 		char ch ='A';
			for(int j=1;j<=n-i+1;j++){
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
