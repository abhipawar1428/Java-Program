import java.io.*;
class Myappend{
	static StringBuffer myappend(StringBuffer str,String str1){
		char sb[]=str.toString().toCharArray();
		char st[]=str1.toCharArray();

		char temp[]=new char[sb.length+st.length];
		for(int i=0;i<sb.length+st.length;i++){
			if(i<sb.length){
				temp[i]=sb[i];
			}else{
				temp[i]=st[i-sb.length];
			}
		}
		str=new StringBuffer(new String(temp));
	        return str;

	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter StringBuffer");
		StringBuffer str=new StringBuffer(br.readLine());
		
		System.out.println("Enter String or StringBuffer to append");
		String str1=br.readLine();

		str=myappend(str,str1);
		System.out.println(str);



	}
}
