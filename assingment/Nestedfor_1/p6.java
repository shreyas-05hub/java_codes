/*
 9 8 7
 9 8 7
 9 8 7
 */
class P6{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			int n=9;
			for(int j=1;j<=3;j++){
				System.out.print(n-- +" ");
			}
			System.out.println();
		}
	}
}
