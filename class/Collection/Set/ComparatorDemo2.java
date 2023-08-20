import java.util.*;

class Movies{
	String movieName = null;
	float totcoll = 0.0f;
	Movies(String movieName,float totcoll){
		this.movieName = movieName;
		this.totcoll = totcoll;
	}
	public String toString(){
		return "{" +movieName+":"+totcoll+"}";
	}
}
class SortByName implements Comparator<Movies>{
	public int compare(Movies obj1,Movies obj2){
		return -(obj1.movieName.compareTo(obj2.movieName));
	}
}
class SortBycoll implements Comparator<Movies>{
	public int compare(Movies obj1,Movies obj2){
		return(int)(obj1.totcoll-obj2.totcoll);
	}
}
class UserListSort{
	public static void main(String[] args){
		ArrayList ts = new ArrayList();
		ts.add(new Movies("Gadar2",150.00f));
		ts.add(new Movies("OMG2",120.00f));
		ts.add(new Movies("Jailer",250.00f));
		ts.add(new Movies("OMG2",120.00f));

		System.out.println(ts);

		Collections.sort(ts,new SortByName());
		System.out.println(ts);
		Collections.sort(ts,new SortBycoll());
		System.out.println(ts);
	}
}
