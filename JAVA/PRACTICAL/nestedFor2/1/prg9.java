//A b C d
//E f G h 
//I j K l



class pattern{
	public static void main(String[] args){
		char ch='a',CH='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(CH+" ");
				}else{
					System.out.print(ch+"  ");
				}
				CH++;
				ch++;
			}
			System.out.println();
		}
	}
}
