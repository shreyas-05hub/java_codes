/*
  1A 2B 3C
  1A 2B 3C 
  1A 2B 3C
*/
class p4{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			char x ='A';
			for(int j=1;j<=3;j++){
				System.out.print(j+ ""+x);
				x++;
			}
			System.out.println();
		}
	}
}
