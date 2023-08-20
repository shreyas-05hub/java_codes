import java.util.*;

class Employee{
	String empName = null;
	float sal = 0.0f;
	Employee(String empName,float sal){
		this.empName = empName;
		this.sal = sal;
	}
	public String toString(){
		return "{"+empName+":"+sal+"}";
	}
}
class SortByName implements Comparator<Employee>{
	public int compare(Employee obj1, Employee obj2){
		return obj1.empName.compareTo(obj2.empName);
	}
}
class SortBySal implements Comparator<Employee>{
	public int compare(Employee obj1, Employee obj2){
		return (int)(obj1.sal-obj2.sal);
	}
}
class LSDemo{
	public static void main(String[] args){
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Kanha",20000.00f));
		al.add(new Employee("Ashish",25000.00f));
		al.add(new Employee("Badhe",15000.00f));
		al.add(new Employee("Rahul",17500.00f));

		System.out.println(al);
		
		Collections.sort(al,new SortByName());
		System.out.println(al);
		Collections.sort(al,new SortBySal());
		System.out.println(al);
	}
}
