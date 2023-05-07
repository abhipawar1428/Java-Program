class Myconcat{
	static String myconcat(String str1,String str2){
		char arr[]=new char[str1.length()+str2.length()];
		for(int i=0;i<str1.length();i++){
			arr[i]=str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++){
			arr[i+str1.length()]=str2.charAt(i);
		}
		String str3=new String(arr);
		return str3;
	}
	public static void main(String[] args){
		String str1="Abhi Sameer ";
		String str2="Pawar";

		System.out.println(myconcat(str1,str2));
	}
}
