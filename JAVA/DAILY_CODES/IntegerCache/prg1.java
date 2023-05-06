class demo{
	public static void main(String [] args){
		int x=10;
		int z=10;
		Integer y=10;
		System.out.println(y); //10
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));   //all this identityHashCode have same value
		//identity hashcode of variable which have values between -128 to 127 are same 
		//values other than -128 to 127 have different identityHashCode

	}
}
