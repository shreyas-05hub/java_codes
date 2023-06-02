//WAP to print the sum of all even no and multiplication of  odd no between 1 to 10

class no{
	public static void main(String[] args){
		int n=1;
		int mult=1;
		int sum=0;

		while(n<=10){
			if(n%2==0){
				sum=sum+n;
			//	749366580
		}
		else{
			mult=mult*n;
		}
		n++;
	}
	System.out.println(sum+"Sum of even no between 1 to 10 is");
	System.out.println(mult+"Multiplication of odd no between 1 to 10 is");
}
}
