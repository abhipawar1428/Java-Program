class demo{
	public static void main(String[] args){
	//	int arr[][]=new int[][]{{,,},{,,},{}};  wrong way to create to jagged array
	
		int arr[][]={{1,2,3},{4,5},{6}};   //method 1
		int arr1[][]=new int[4][];         //method 2
		//arr1[0]={1,2,3};  //error  no object created
		arr1[0]=new int[]{1,2,3};
		arr1[1]=new int[]{4,5};
		arr1[2]=new int[]{6};
		arr1[3]=new int[]{9,8,7};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr1[3].length);
	}
}
