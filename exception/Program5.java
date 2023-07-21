import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		System.out.println(str1);

		int data=0;

		try{
			data = Integer.parseInt(br.readLine());		//risky code
		}catch(NumberFormatException obj){
			System.out.println("Please enter integer data : ");		//handling code
			data = Integer.parseInt(br.readLine());
		}

		System.out.println(data);
	}
}
