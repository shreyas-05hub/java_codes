class p{
	int x =10;
	p(){
		System.out.println("In No-args Constructor");
	}
	p(int x){
		System.out.println("In para Constructor");
	}
	public static void main(String[] args){
		p obj = new p();
		p obj1 = new p(10);
	}
}
