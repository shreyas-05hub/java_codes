//Given an integer value as input
//print fizz if it is divisible by 3
//print buzz if it is divisible by 5
//print fixx-buzz if it is divisible by 3 & 5
//if not then print not divisible by both

class integer{
	public static void main(String [] args){
		int x=10;

		if(x%3==0 && x%5==0)
			System.out.println(x+ "is divisible by 5 and 3");
		else if(x%3==0)
			System.out.println(x+  "is divisible by 3");
		else if(x%5==0)
			System.out.println(x+ "is divisible by 5");
		else
			System.out.println(x+ "neither divisible by 3 or 5");
	}
}
