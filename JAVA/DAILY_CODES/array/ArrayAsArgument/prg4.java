class demo{
	public static void main(String[] args){
		int arr[]={10,20,30,40};
		System.out.println("Hash code of 10 20 30 40");
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		demo obj=new demo();
		obj.fun(arr);
		System.out.println("Array is ");
		for(int x:arr){
			System.out.print(x+" ");

		}
		System.out.println();
		int x=70;
		int y=80;
		int z=129;
		System.out.println("Hash code of x and y");
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

		System.out.println(System.identityHashCode(70));
		System.out.println(System.identityHashCode(80));
		
		System.out.println("hash code of z ie 129 is") ;
		System.out.println(System.identityHashCode(z));
	}
	void fun(int arr[]){
		//here hash code of arr[1] arr[2](70,80) are same with x and y in main
		//but arr[3] is not same with z bcz it's value greater than 127
		arr[1]=70;
		arr[2]=80;
		arr[3]=129;
		System.out.println("Hash code of arr[1] and arr[2] ie 70 and 80");
		System.out.println(System.identityHashCode(arr[1]));  //identity hashcode of this two and x and y that are on 19 20 are same
		System.out.println(System.identityHashCode(arr[2]));

		System.out.println("Hash code of 129 is ");
		System.out.println(System.identityHashCode(arr[3]));
	}
}
