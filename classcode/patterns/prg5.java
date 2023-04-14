
//9 8 7 
//6 5 4  
//3 2 1
class pattern{
	public static void main(String[] args){
		int no=9;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(no+" ");
				no--;
			}
			System.out.println();
		}
	}
}
