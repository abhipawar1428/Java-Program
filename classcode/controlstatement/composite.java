class composite{//non prime
	public static void main(String[] args){
		int num=61;
		int count=0;

		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count>2){
			System.out.println("Composite");
		}else{
			System.out.println("Non Composite(Prime)");
		}

	}

}
