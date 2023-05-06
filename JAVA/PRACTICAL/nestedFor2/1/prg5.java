//26 Z 25 Y
//24 X 23 W
//22 V 21 U
//20 T 19 S


class pattern{
	public static void main(String[] args){
		int no=26;
		char ch='Z';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(no-- +" ");
				}else{
					System.out.print(ch-- +" ");
				}

			}
			System.out.println();
		}
		
	}
}
