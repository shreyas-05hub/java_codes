class project{
	String progName = "OnlineEdu";
	void ClientInfo(){
		String ClientName = "Core2web";
		System.out.println(ClientName);
		System.out.println(progName);
	}
}
class C2w{
	public static void main(String[] args){
		project obj = new project();
		obj.ClientInfo();
	}
}
