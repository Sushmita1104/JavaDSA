class PrivateDemo1{
	int x=10;
	private int y=20;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String[] args){
		PrivateDemo1 obj = new PrivateDemo1();
		obj.fun();
		System.out.println(obj.x);
		System.out.println(obj.y);	//y has private access in PrivateDemo1
		System.out.println(x);		//cannot find symbol
		System.out.println(y);		//cannot find symbol
	}
}

