class p1{
	public static void main(String[] args){
		int N=15,count=0;
		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
				if(count>2){
					break;
				}
			}
		}
		if(count==2){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
}
