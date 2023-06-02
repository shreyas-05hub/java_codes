//print odd integers in loop 1 to N 

class p4{
	public static void main(String[] args){
		int N=1;
/*
		for(int i=1 ; i <=N ; i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}

		-*/

		while(N<=10){
			if(N%2!=0){
				System.out.println(N);
			}
			N++;
		}
	}
}
