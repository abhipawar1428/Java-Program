import java.io.*;
class MyReplace{
	static String myReplace(String str,char och,char nch){
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(och==arr[i]){
				arr[i]=nch;
			}
		}
		String str1=new String(arr);
		return str1;
	}
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		
		System.out.println("Enter old char and new char");
		char och=(char)br.read();
		br.skip(1);
		char nch=(char)br.read();

		System.out.println(myReplace(str,och,nch));
	}
}
