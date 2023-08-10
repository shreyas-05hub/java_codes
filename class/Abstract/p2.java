abstract class IndianGov{
	abstract void EmergencyFunds();
}	
class State extends IndianGov{
	void EmergencyFunds(){
		System.out.println("EmergencyFunds");
	}
}
class Client{
	public static void main(String[] args){
		IndianGov disaster = new State();
		disaster.EmergencyFunds();
	}
}
