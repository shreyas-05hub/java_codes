class p2{
		int x =10;
		p2(){
			System.out.println("In Constructor");
			System.out.println(this);
			System.out.println(this.x);
		}
		void fun(){
			System.out.println(this);
			System.out.println(x);
		}
		public static void main(String[] args){
			p2 obj = new p2();
			System.out.println(obj);
			obj.fun();
		}
}
