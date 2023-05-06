//4 5 6 7
//4 5 6 7
//4 5 6 7 
//4 5 6 7

class pattern{
	public static void main(String[] args){
		int num=4;
		for(int i=1;i<=4*4;i++){
			System.out.print(num+" ");
			num++;
			if(num==8){
				System.out.println();
				num=4;
			}
		}
	}
}
