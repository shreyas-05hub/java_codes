class p11{
	void m1(){
		
	}
	void m2(){

	}
	public static void main(String[] args){
		p11 obj = new p11();
		obj.m1();
		obj =null;
		try{
			obj.m2();
		}catch(ArithmeticException obj1){

		}finally{
			System.out.println("Connection Closed");
		}
	}
}
