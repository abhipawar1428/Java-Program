

//1 4 9 
//16 25 36 
//49 64 81
class pattern{
	public static void main(String[] args){
		int no=1;
		for(int i=5;i<=7;i++){
			for(int j=5;j<=7;j++){
				System.out.print(no*no+" ");
				no++;
			}
			System.out.println();
		}
	}
}
