import java.io.*;
class MyEquals{
	static boolean myEquals(String str1,String str2){
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first String ");
		String str1=br.readLine();
		System.out.println("Enter Second String");
		String str2=br.readLine();

		boolean ret=myEquals(str1,str2);
		System.out.println(ret);
	}
}
