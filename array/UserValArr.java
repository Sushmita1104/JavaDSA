import java.util.Scanner;
class UserValArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 elements of array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

