//if sum of factorial of each digit of number is equal to number then its strong 

class strongno{
	public static void main(String[] args){
		int num=40585;
		int temp=num;
		int sum=0;
		while(num!=0){
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;

		}
		if(temp==sum){
			System.out.println("Strong");
		}else{
			System.out.println("Non strong");
		}
	}
}
