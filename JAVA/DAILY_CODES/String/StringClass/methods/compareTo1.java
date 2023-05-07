class Demo{
	public static void main(String[] args){
		String str1="Abhi";
		String str2="abhi";
		String str3="abhishek";
		String str4="abhishe";
		String str5="Bhuu";

		System.out.println(str1.compareTo(str2));  //-32
		System.out.println(str1.compareTo(str3));  //-32
		System.out.println(str3.compareTo(str4));  //1
		System.out.println(str1.compareTo(str5));  //-1
		System.out.println(str2.compareTo(str3));  //-4
	}
}
