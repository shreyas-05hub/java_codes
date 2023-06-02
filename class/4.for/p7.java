//prefect no od=r not 
//sum of factors = given no 

class perfect{
	public static void main(String[] s){
		int n=6;
		int sum=0;

		for(int i=1;i<n;i++){
			if(n%i==0)
				sum=sum+i;
		}
		if(n==sum){
			System.out.println("is perfect no");
		}else{
			System.out.println("not perfect");
		}
	}
}
