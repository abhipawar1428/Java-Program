import java.io.*;
class MyReverse{
	static StringBuffer myreverse(StringBuffer sb){
		char arr[]=new char[sb.length()];
		for(int i=sb.length()-1;i>=0;i--){
			arr[sb.length()-1-i]=sb.charAt(i);
		}
		sb=new StringBuffer(new String(arr));
		return sb;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter StringBuffer");
		StringBuffer sb=new StringBuffer(br.readLine());

		sb=myreverse(sb);
		System.out.println(sb);
	}
}
