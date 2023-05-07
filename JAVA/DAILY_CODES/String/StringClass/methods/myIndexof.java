import java.io.*;
class MyIndexOf{
	static int myIndexOf(String str,char ch){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="Abhishek";
		System.out.println("Enter char to search");
		char ch=(char)br.read();
		System.out.println(myIndexOf(str,ch));
	}
}
