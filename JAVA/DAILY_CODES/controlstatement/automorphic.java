//5->25   true
//6->36   true
//25->625   true
//9->81  false

class automorphic{
	public static void main(String[] args){
		int num=76;
		int flag=1;

		int sqr=num*num;
		while(num!=0){
			if((num%10)!=(sqr%10)){
				flag=0;
			
			
			}
			num=num/10;
			sqr=sqr/10;
		}
		if(flag==1){
			System.out.println("AutoMorphic");
		}else{
			System.out.println("Not automorphic");
		}

	}
}
