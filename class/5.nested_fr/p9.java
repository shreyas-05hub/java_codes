/*
 A B C
 A B C
 A B C
*/
class P9{

	public static void main(String[] s){
		for(int i=1;i<=3;i++){
			char ch = 'A';
			for(int j=1;j<=3;j++){
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
