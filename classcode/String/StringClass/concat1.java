class Demo{
	public static void main(String[] args){
		String str1="Abhi";
		String str2="Pawar";

		System.out.println(str1+str2);   //AbhiPawar

		String str3=str1+str2;
		String str4="AbhiPawar";

		String str5=str1.concat(str2);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));

		//str3 ,str4 and str5 have diff identity hashcode 
		//as str3 and str5 resides in heap area and str4 reside in SCP
	}
}
