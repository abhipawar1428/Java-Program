
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
class pattern{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			int n=6;
			char ch='F';
			for(int j=1;j<=6;j++){
				if(j%2==1){
					System.out.print(ch +" ");
				}else{
					System.out.print(n+" ");
				}
				ch--;
				n--;
			}
			System.out.println();
		}
	}
}
