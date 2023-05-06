class demo{
	static void fun(int[] xarr){
		for(int x:xarr){
	        	System.out.print(x+" ");

		}
		System.out.println();
		xarr[1]=50;
		xarr[2]=60;
		for(int x:xarr){
	        	System.out.print(x+" ");

		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[]={10,20,30,40,50};
		for(int x:arr){
			System.out.print(x+" ");

		}
		System.out.println();
		fun(arr);

		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}
	//output is :  
	//10 20 30 40 50
	//10 20 30 40 50
	//10 50 60 40 50
	//10 50 60 40 50
}
