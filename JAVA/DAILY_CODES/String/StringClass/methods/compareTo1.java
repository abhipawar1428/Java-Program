class Demo{
	public static void main(String[] args){
		String str1="Abhi";
		String str2="abhi";
		String str3="abhishek";
		String str4="abhishe";

		System.out.println(str1.compareTo(str2));  //-32
		System.out.println(str1.compareTo(str3));  //-32
		System.out.println(str3.compareTo(str4));  //1
	}
}
