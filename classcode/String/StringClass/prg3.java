class Demo{
	public static void main(String[] args){
		String str1="c2w";
		String str2=str1;
		String str3=new String(str2);
		String str4=new String("c2w");
		String str5=new String("c2w");


		char arr[]={'c','2','w'};
		String str6=new String(arr);

		//identityHashCode of str1 and str2 and same 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		System.out.println(System.identityHashCode(arr));
/*
225534817
225534817
1878246837
929338653
1259475182
1300109446
1020371697
*/	}
}
