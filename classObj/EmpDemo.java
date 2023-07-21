class EmpDemo{
	int empId = 10;
	String name = "Nikii";
	static int y = 50;
	void empInfo(){
		System.out.println("Id = "+empId);
		System.out.println("Name = "+name);
		System.out.println("Y = "+y);
	}
}
class MainDemo{
	public static void main(String[] args){
		EmpDemo emp1 = new EmpDemo();
		EmpDemo emp2 = new EmpDemo();
		emp1.empInfo();
		emp2.empInfo();
		System.out.println("--------------------------------");
		emp2.empId = 20;
		emp2.name = "Rahul";
		emp2.y = 5000;
		emp1.empInfo();
		emp2.empInfo();
	}
}


