class MethSign{
	int x=10;
	MethSign(){
		System.out.println("In constructor");
		System.out.println("x = "+x);
	}
	MethSign(){	//Error: Constructor MethSign() is already defined in class MethSign.
		System.out.println("In Constructor 2");
		System.out.println("x = "+x);
	}
}


