class This1{
	int x=10;
	This1(){	//This1(This1 obj)
		System.out.println("In Constructor");
		System.out.println(this);
		System.out.println(this.x);
	}
	void fun(){	//fu(This1 this)
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[] args){
		This1 obj = new This1();	//This1(obj)
		System.out.println(obj);
		obj.fun();
	}
}

