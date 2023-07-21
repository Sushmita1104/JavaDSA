import java.io.*;
class Br2{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player name: ");
		String name = br.readLine();
		System.out.println("Enter jersy no.");
		int jer = Integer.parseInt(br.readLine());
		System.out.println("Enter his average: ");
		float avg = Float.parseFloat(br.readLine());
		System.out.println("name: "+name);
		System.out.println("jersy no.: "+jer);
		System.out.println("average: "+avg);
	}
}


