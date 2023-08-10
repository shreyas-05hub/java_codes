/*
 A b C d
 E f G h
 I j K l
 M n O p
 */
class p9{
	public static void main(String[] args){
		char ch ='a';
		char c ='A';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(ch+" ");
				}else{
					System.out.print(c+" ");
				}
				ch++;
				c++;
			}
			System.out.println();
		}		
	}
}
