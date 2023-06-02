class pl{
	public static void main(String[] args){
		double sp=1200;
		double cp=1000;
		double sum=sp-cp;
		
		if(sum<0){
			System.out.println(sum+"is Profit");
		}else if(sum>0){
			System.out.println(sum+"is Loss");
		}else{
			System.out.println("NO Profit NO Loss");
		}
	}
}
