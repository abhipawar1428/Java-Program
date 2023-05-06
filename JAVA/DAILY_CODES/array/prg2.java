class Demo{
	//different ways of array declaration
	public static void main(String[] args){
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;

		int arr1[]={20,2,20,20};
		int arr2[]=new int[]{30,30,30,30,30};

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}
}
