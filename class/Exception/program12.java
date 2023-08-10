class StackDemo{
	static void fun(int x){
		fun(++x);
	}
	public static void main(String[] args){
		try{
			fun(1);
		}catch(StackOverflow obj){
			obj.printStackTrace();
		}
	}
}
