//handling exception with multiple catch statements
//sequence of exceptions in catch should be child and then parent 
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		int data=0;

		try{
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
			System.out.println("Exception handled by NumberFormatException");
		}catch(IllegalArgumentException obj){
			System.out.println("Exception handled by IllegalArgumentException");
		}

		System.out.println(data);
	}

}


