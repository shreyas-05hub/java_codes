import java.util.*;
class CricPlayer{
	int jerno =0;
	String name = null;

	CricPlayer(int jerno, String name){
		this.jerno=jerno;
		this.name=name;
	}
	public String toString(){
		return name;
	}
}
class ArrayListDemo2{
	public static void main(String[] args){
		ArrayList al =new ArrayList();
		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(7,"Msdhoni"));
		al.add(new CricPlayer(45,"Rohit"));

		System.out.println(al);
	}
}
