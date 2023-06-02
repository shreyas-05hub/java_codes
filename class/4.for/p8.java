//Armstrong no

class arm{
	public static void main(String[] s){
		int n=153;
		int sum=0;
		int temp1=n;
		int temp2=n;
		int count=0;

		while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		while(n!=0){
			int rem=n%10;
			int mult=1;
			for(int i=1;i<=count;i++){
				mult=mult*rem;
			}
				sum=sum+mult;
				n=n/10;
			}
			if(temp2==sum)
				System.out.println("is Armstrong no");
			else
				System.out.println("not armstrong no");
		}
	}
