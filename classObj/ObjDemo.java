class Project{
	String prjName="OnlineEdu";
	int noOfEmp=20;
	void clientInfo(){
		String clientName="Core2web";
		System.out.println(clientName);
		System.out.println(prjName);
		System.out.println(noOfEmp);
	}
	public static void main(String[] args){
		Project obj = new Project();
		obj.clientInfo();
	}
}


