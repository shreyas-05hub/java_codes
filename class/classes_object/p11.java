class Employee{
	int empId =10;
	String name = "Kanha";

	static int y = 50;

	void empInfo(){
		System.out.println("Id =" +empId);
		System.out.println("Name =" +name);
		System.out.println("y =" +y);
	}
}
class Main11{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();	

		emp1.empInfo();
		emp2.empInfo();

		emp2.empId = 20;
		emp2.name = "Rahul";
		emp2.y=5000;

		emp1.empInfo();
		emp2.empInfo();
	}
}
