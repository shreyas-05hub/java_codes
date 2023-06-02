class Demo{
	public static void main(String[] s){
		Demo obj = new Demo();
		int ret = obj.fun(10);
		System.out.println(ret);
	}
	int fun(int x){
		int val=x+50;
		return val;
	}
}
