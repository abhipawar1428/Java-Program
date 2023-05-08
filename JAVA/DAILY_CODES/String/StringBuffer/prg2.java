class Demo{
	public static void main(String srgs[]){
		StringBuffer str=new StringBuffer("");
		System.out.println(str);                //
		System.out.println(str.capacity());     //16

		str.append("Abhi");
		System.out.println(str);                //Abhi     (4)
		System.out.println(str.capacity());     //16

		str.append("Pawar");
		System.out.println(str);                //AbhiPawar   (9)
		System.out.println(str.capacity());     //16

		str.append("Abhishek");
		System.out.println(str);                //AbhiPawarAbhishek  (17)
		System.out.println(str.capacity());     //34


	}
}
