//1C3 4B2 9A1
//16C3 25B2 36A1
//49C3 64B2 81A1
//

class pattern{
	public static void main(String[] args){
		int n=1;
		char ch='C';
		for(int i=3;i>=1;i--){
			ch='C';
			for(int j=3;j>=1;j--){
				System.out.print(n*n++ + ""+ ch-- +j+" ");
			}
			System.out.println();
		}
	}
}
