class Demo{
	void marry(){
		System.out.println("Marry1");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj = new Demo(){
			void marry(){
				System.out.println("Marry2");
			}
		};
		obj.marry();
	}
}
