class Demo{
	public static void main(String[] args){
		String str1="Abhi";
		String str2="abhi";
		String str3=new String("Abhi");

		System.out.println(str1.equals(str2));  //false
		System.out.println(str1.equals(str3));  //true

		//compareTo and compareToIgnoreCase return difference ...if strings are same then returns 0
		//equals method return only true or false
	}
}
