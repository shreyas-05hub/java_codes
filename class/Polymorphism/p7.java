class Match{
	void matchType(){
		System.out.println("T20/Oneday/Test");
	}
}
class Iplmatch extends Match{
	void matchType(){
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	void matchType(){
		System.out.println("TEST");
	}
}
class Client{
	public static void main(String[] args){
		Match type1 = new  Iplmatch();
		type1.matchType();

		Match type2 = new TestMatch();
		type2.matchType();
	}
}
