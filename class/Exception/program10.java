class p10{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println("In loop");
			try{
			Thread.sleep(5000);
			}catch(InterruptedException obj){
				
			}
		}
	}
}
