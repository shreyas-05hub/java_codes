class pyth{
	public static void main(String[] args){
		int a=3,b=4,c=5;

		if(a*a==b*b+c*c){
			System.out.println("It is pythagorean triplet");
		}else if(b*b==c*c+a*a){
			System.out.println("It is pythagorean triplet");
		}else if(c*c==b*b+a*a){
			System.out.println("It is pythagorean triplet");
		}else{
			System.out.println("It is not pythaorean triplet");
		}
	}
}
