//***
//***
//***

class sq{
	public static void main(String[] s){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(j==2)
					break;
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
