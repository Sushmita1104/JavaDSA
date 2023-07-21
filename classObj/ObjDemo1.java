class MCD{
	int noOfBurger=5;
	String product="fries";
	void menu(){
		String menu1="veg";
		String menu2="non-veg";
		System.out.println(noOfBurger);
		System.out.println(product);
	}
}
class User{
	public static void main(String[] args){
		MCD obj = new MCD();
		obj.menu();
	}
}

