class Constructor1{
	Constructor1(){
		System.out.println("In Constructor");
	}
	void fun(){
		Constructor1 obj = new Constructor1();
	}
	public static void main(String args[]){
		Constructor1 obj1 = new Constructor1();
		Constructor1 obj2 = new Constructor1();
		obj1.fun();
	}
}

