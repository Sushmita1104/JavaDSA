import java.io.*;
class Br3{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter building name: ");
		String bname = br.readLine();
		System.out.println("Enter wing: ");
		char wing = (char)br.read();
		br.skip(1);
		System.out.println("Enter flat no.: ");
		int flat = Integer.parseInt(br.readLine());
		System.out.println("Building name: "+bname);
		System.out.println("Wing: "+wing);
		System.out.println("Flat no.: "+flat);
	}
}


