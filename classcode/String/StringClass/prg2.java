class Demo{
	public static void main(String[] args){
		String str1="C2W";
		String str2="C2W";
		String str3=new String("C2W");
		String str4=new String("C2W");
		String str5=new String(str4);
		char arr[]={'c','o','r','e'};

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(arr));

		//identityHashCode of str1 and str2 are same
		//str1 ,str2 and stored on String Constant Pool i.e SCP
		//and str3,str4,str5 are stored on heap area 
		//and str6 will be stored on integer chache because char stored internally as int and its range is from -128 to 127

	}
}
