class Core2web{
	int noOfCourse=5;
	String favcourse = "WT";
	void display(){
		System.out.println(noOfCourse);
		System.out.println(favcourse);
	}
}
class Project{
	public static void main(String[] args){
		Core2web obj = new Core2web();
	        obj.display();
	}
}


