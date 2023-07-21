class InstDemo1{
	int x = 10;
	InstDemo1(){
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance block 1");
	}

	public static void main(String[] args){
		InstDemo1 obj = new InstDemo1();
		System.out.println("Main");
	}

	{
		System.out.println("Instance block 2");
	}

}

