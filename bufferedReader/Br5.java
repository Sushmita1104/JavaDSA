import java.io.*;
class Br5{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		System.out.println("String: "+str1);
		br.close();                          //error: stream closed!
		char ch = (char)br.read();
		System.out.println("Char: "+ch);
	}
}

