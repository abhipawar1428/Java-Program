class demo{
	static void fun(int[] arr){
		for(int x:arr){
	        	System.out.print(x+" ");

		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+50;
		}
	}
	public static void main(String[] args){
		int arr[]={50,100,150};
		fun(arr);
		for(int x:arr){
			System.out.print(x+" ");

		}
		System.out.println();
		
	}
	//output is:
	//50 100 150
	//100 150 200
}

