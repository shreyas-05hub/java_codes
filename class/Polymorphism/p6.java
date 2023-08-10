class Ipl{
	void MatchInfo(String team1,String team2){
		System.out.println(team1+"vs"+team2);
	}
	void MatchInfo(String team1,String team2,String Venue){
		System.out.println(team1+"vs"+team2);
		System.out.println("Venue="+Venue);
	}
}
class Client{
	public static void main(String[] args){
		Ipl ipl2023 = new Ipl();
		ipl2023.MatchInfo("GT","CSK");
		ipl2023.MatchInfo("GT","CSK","NMSA");
	}
}
