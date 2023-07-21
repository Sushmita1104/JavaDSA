//Super call to parent's constructor

class ICC{
	ICC(){
		//super();
		System.out.println("In ICC constructor");
	}
}
class BCCI extends ICC{
	BCCI(){
		//super();
		System.out.println("In BCCI constructor");
	}
}
class Client{
	public static void main(String[] args){
		BCCI obj = new BCCI();	//BCCI(obj)
	}
}

