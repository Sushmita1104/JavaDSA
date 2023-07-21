import java.util.Scanner;
class EvenOddCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int even=0;
		int odd=0;
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even numbers count is: "+even);
		System.out.println("Odd numbers count is: "+odd);
	}
}


