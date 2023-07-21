class Core2web{
	int noCourses = 8;
	private String favcourse = "CPP";
	void display(){
		System.out.println(noCourses);
		System.out.println(favcourse);
	}
}
class Student{
	public static void main(String args[]){
		Core2web obj = new Core2web();
		obj.display();
		System.out.println(obj.noCourses);
		System.out.println(obj.favcourse);	// favcourse has private access in Core2web
	}
}



