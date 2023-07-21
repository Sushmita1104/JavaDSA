//handling exception with try catch

class Demo{
	public static void main(String[] args){
		System.out.println("start main");

		try{
			System.out.println(10/0);
		}catch(ArithmeticException obj){
			System.out.println("Exception occurred");
		}

		System.out.println("End main");
	}
}


