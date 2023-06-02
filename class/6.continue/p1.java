//prime 

class prime{
	public static void main(String[] s){
		int n=15;
		int count=0;
		for(int i=1;i<=15;i++){
			if(n%i==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
		if(count==2){
			System.out.println(n+" is a prime no");
		}
		else{
			System.out.println(n+" is not a prime no");
		}
	}
}
