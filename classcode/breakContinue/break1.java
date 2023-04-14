class breakcode{
	public static void main(String[] args){
		int no=6;
		int count=0;

		for(int i=1;i<=no;i++){
			if(no%i==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
		if(count==2){
			System.out.println("Prime");
		}else{
			System.out.println("Non Prime");
		}
	}
}
