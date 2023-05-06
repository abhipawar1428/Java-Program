//if addition of all factors excluding itself is equal to that no then its perfect no
//6=1+2+3==6   then its perfect no

class perfect{
	public static void main(String[] args){
		int num=9;
		int sum=0;

		for(int i=1;i<num;i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum==num){
			System.out.println("Perfect no");

		}else{
			System.out.println("Not perfect no");
		}
	}
}
