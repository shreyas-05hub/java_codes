/*
 * _ _ *
 * _ _ *
 * _ _ *
 * _ _ *
 */

class p13{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j =1;j<=4;j++){
				if(j==1||j==4)
					System.out.print("* ");
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
	}
}
