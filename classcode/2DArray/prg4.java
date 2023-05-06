class demo{
	public static void main(String[] args){
		int arr[][]=new int[2][2];

		arr[0][0]=10;
		arr[0][1]=10;
		arr[1][0]=10;
		arr[1][1]=10;

		System.out.println(arr[1][1]);  //10
		System.out.println(arr[0]);     //[I..
		System.out.println(arr[1]);     //[I..
		System.out.println(arr);        //[[I..
	}
}
