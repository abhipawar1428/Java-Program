//2 3 5 7
//11 13 17 19
//23 


class pattern{
	public static void main(String[] args){
		int p=1;int count=0;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				while(true){
					for(int k=1;k<=p;k++){
						if(p%k==0){
							count++;
						}
						if(count>2){
							break;
						}
					}
					if(count==2){
						System.out.print(p+" ");
						break;
					}
					p++;
					count=0;	
				}
			}
			System.out.println();
		}
	}
}
