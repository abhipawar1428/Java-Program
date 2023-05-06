class Demo{
	public static void main(String[] args){
		String str1="abhi";
		String str2="Abhi";
		String str3="abhh";

		System.out.println(str1.compareToIgnoreCase(str2));  //0
		System.out.println(str1.compareToIgnoreCase(str3));  //1
		System.out.println(str2.compareToIgnoreCase(str3));  //1

	}
}


