class HiddenThis{
	int x =10;
	HiddenThis(){		//HiddenThis(HiddenThis this)	//this.x=10
		System.out.println("In no-args Constructor");
	}
	HiddenThis(int x){		//HiddenThis(HiddenThis this,int x)	//this.x=10 //x=10
		System.out.println("In para-constructor");
	}
	public static void main(String args[]){
		HiddenThis obj1 = new HiddenThis();	//HiddenThis(obj1)
		HiddenThis obj2 = new HiddenThis(20);	//HiddenThis(obj2,20)
	}
}
