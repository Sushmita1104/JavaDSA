class ArmstrongNo{
	public static void main(String args[]){
		int n=150;
		int temp=n;
		int rem=0;
		int sum=0;
		for(;n!=0;n=n/10){
			rem=n%10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==temp)
			System.out.println(temp+" is an armstrong number");
		else
			System.out.println(temp+" is not an armstrong number");
	}
}

