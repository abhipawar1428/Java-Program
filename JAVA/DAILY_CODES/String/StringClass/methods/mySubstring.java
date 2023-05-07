class MySubstring{
	static String mySubstring(String str,int index){
		char arr[]=str.toCharArray();
		char carr[]=new char[str.length()-index];
		for(int i=index;i<str.length();i++){
			carr[i-index]=arr[i];
		}
		String str1=new String(carr);
		return str1;
	}
	static String mySubstring(String str,int start,int end){
		char arr[]=str.toCharArray();
		char carr[]=new char[end-start];
		for(int i=start;i<end;i++){
			carr[i-start]=arr[i];
		}
		String str1=new String(carr);
		return str1;
	}
	public static void main(String[] args){
		String str="Abhi Pawar";
		System.out.println(mySubstring(str,5));
		System.out.println(mySubstring(str,1,4));
	}
}
