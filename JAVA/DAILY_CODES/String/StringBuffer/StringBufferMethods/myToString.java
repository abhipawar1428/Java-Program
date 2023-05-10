import java.io.*;
class MyToString{
	static String myToString(StringBuffer str){
		char arr[]=new char[str.length()];
		for(int i=0;i<arr.length;i++){
			arr[i]=str.charAt(i);
		}

		String str1=new String(arr);
	        return str1;

	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter StringBuffer");
		StringBuffer str=new StringBuffer(br.readLine());
		
		String str1=myToString(str);
		System.out.println(str1);



	}
}
