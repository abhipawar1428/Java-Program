class armstrong{
	public static void main(String[] args){
		int sum=0;
		int num=153;
		int temp=num;

		

		int count=0;
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		

		//System.out.println("flag1");
		temp=num;
		while(temp!=0){
			int rem=temp%10;
			int mul=1;
			for(int i=1;i<=count;i++){
				mul=mul*rem;
			}

			sum=sum+mul;
			temp=temp/10;
		}
	
		//System.out.println("flag2");
		if(num==sum){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not Armstrong");
		}
	}
}
