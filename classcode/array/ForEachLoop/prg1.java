// For each loop example
class demo{
	public static void main(String[] args){
	int arr[]={10,20,30,40,50};
	
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");  //10 20 30 40 50 
	}
	System.out.println();

	for(int x:arr){
		System.out.print(x+" ");  //10 20 30 40 50
	
	}
	System.out.println();
	for(int x:arr){

		System.out.print(arr[0]+" ");// 10 5 times
	}

	System.out.println();
	for(float x:arr){
		System.out.print(x+" "); //there is no data loss hence int can be stored in float and print 
		                            //10.0 20.0 30.0 40.0 50.0
	}

/*	for (short x:arr){
		System.out.print(x+" ");    //there data loss 
		                            //possible loosy conversion from int short
					    //so error
	}


*/
	//we can use bigger data type to store value hence here double and float are not throws error
	System.out.println();
	for(double x : arr){
		System.out.print(x+" ");
	}

	}

}
