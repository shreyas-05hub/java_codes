/*
 A 1 B 2
 A 1 B 2
 A 1 B 2
*/
class P10{

	public static void main(String[] s){
		for(int i=1;i<=3;i++){
			int n=1;
			char ch='A';
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(ch++ + " ");
				}else{
					System.out.print(n++ + " ");
				}
			}
			System.out.println();
		}
	}
}
