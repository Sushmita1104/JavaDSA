import java.util.Scanner;
class SumArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0;
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			sum = sum +arr[i];
		}
		System.out.println("Sum is:"+sum);
	}
}


