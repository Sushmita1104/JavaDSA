class VimpPlayer{
	private int jerNo=0;
	private String name = null;
	VimpPlayer(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In Constructor");
	}
	void info(){
		System.out.println(jerNo+" = "+name);
	}
}
class Client{
	public static void main(String[] args){
		VimpPlayer obj1 = new VimpPlayer(18,"Virat");	//VimpPlayer(obj1,18,Virat)
		obj1.info();
		VimpPlayer obj2 = new VimpPlayer(45,"Rohit");	//VimpPlayer(obj2,45,Rohit)
		obj2.info();
		VimpPlayer obj3 = new VimpPlayer(7,"Dhoni");	//VimpPlayer(obj3,7,Dhoni)
		obj3.info();
	}
}

