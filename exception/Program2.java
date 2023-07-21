import java.io.*;
class Demo{
	void getdata() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int data=0;
		
		try{
		data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
			System.out.println("Exception handled");
		}
		System.out.println(data);
	}
	public static void main(String[] args)throws IOException{
		Demo obj = new Demo();
		obj.getdata();
	}
}

