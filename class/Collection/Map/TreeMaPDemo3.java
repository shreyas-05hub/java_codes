import java.util.*;

class Platform{
	String str = null;
	int foundyear =0;
	Platform(String str ,int foundyear){
		this.str = str;
		this.foundyear = foundyear;
	}
	public String toString(){
		return str;
	}
}
class SortbyName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}
class TM1{
	public static void main(String[] args){
		TreeMap tm = new TreeMap(new SortbyName());

		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("ChatGPT",2022),"OpenAI");

		System.out.println(tm);

		//Collections.Sort(tm,new SortbyName());
		//System.out.println(tm);
	}
}
