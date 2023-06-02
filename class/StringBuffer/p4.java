import java.util.*;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		StringBuffer str1 = new StringBuffer();
		System.out.println(str1.capacity());
	//	System.out.println(str1);

		System.out.println("Enter String Name");
		StringBuffer str2 = new StringBuffer(sc.next());
		System.out.println(str2.capacity());

		str2.append("Kandekar");
		System.out.println(str2);
		System.out.println(str2.capacity());
	}
}
