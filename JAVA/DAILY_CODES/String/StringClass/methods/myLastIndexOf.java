import java.io.*;
class MyLastIndexOf{
	static int myLastIndexOf(String str,char ch){
		for(int i=str.length()-1;i>=0;i--){
			if(ch==str.charAt(i)){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		System.out.println("Enter char to search");
		char ch=(char)br.read();
		System.out.println(myLastIndexOf(str,ch));
	}
}
