
class Demo{
	public static void main(String[] args){
		String str1="Abhi";
		String str2="abhi";
		String str3=new String("Abhi");
		String str4="abhishek";

		System.out.println(str1.equalsIgnoreCase(str2));  //true
		System.out.println(str1.equalsIgnoreCase(str3));  //true
		System.out.println(str2.equalsIgnoreCase(str4));  //false

		//compareTo and compareToIgnoreCase return difference ...if strings are same then returns 0
		//equals method return only true or false
	}
}
