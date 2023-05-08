import java.io.*;
class MyEqualsIgnoreCase{
	static boolean myEqualsIgnoreCase(String str1,String str2){
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					char max,min;
					if(str1.charAt(i)>str2.charAt(i)){
						max=str1.charAt(i);
						min=str2.charAt(i);
					}else{
						max=str2.charAt(i);
						min=str1.charAt(i);
					}

					if(max-min!=32){
						return false;
					}
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

	boolean ret=myEqualsIgnoreCase(str1,str2);
	System.out.println(ret);
	}
}
