class Zara{
	static String category = "T-shirt";
	char size = 'S';
	void purchase(){
		System.out.println("Clothing Category :"+category);
		System.out.println("Size :"+size);
	}
}
class ClothingBrand{
	public static void main(String[] args){
		Zara obj1 = new Zara();
		Zara obj2 = new Zara();

		obj1.purchase();
		obj2.purchase();

		obj2.category="Trousers";
		obj2.size='M';

		obj1.purchase();
		obj2.purchase();
	}
}

