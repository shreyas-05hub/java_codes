/*
 1 2 3
 4 5 6
 7 8 9
*/

class P8{

	public static void main(String[] s){
		int n=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}
}
