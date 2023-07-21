//to call other constructor from one constructor

class CallConstr{
	int x = 10;
	CallConstr(){
		this(10);	//Error: recursive constructor invocation
		System.out.println("In no-args Constructor");
	}
	CallConstr(int x){
		this();		//call to another constructor	//call to this() is always a first line in constructor
		System.out.println("In para Constructor");
	}
	public static void main(String[] args){
		CallConstr obj = new CallConstr(50);
	}
}

