import java.io.*;
class MyCompareTo{
	static int myCompare(String str1,String str2){
		int min;
		if(str1.length()<=str2.length()){
			min=str1.length();
		}else{
			min=str2.length();
		}
		for(int i=0;i<min;i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return str1.charAt(i)-str2.charAt(i);
			}
		}
		if(str1.length()!=str2.length()){
			return str1.length()-str2.length();
		}
		return 0;
		
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String 1");
		String str1=br.readLine();
		System.out.println("Enter String 2");
		String str2=br.readLine();

		System.out.println(myCompare(str1,str2));
	}
}
