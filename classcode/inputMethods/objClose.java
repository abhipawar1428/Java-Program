import java.io.*;

class Buffer{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String 1");
		String str1=br.readLine();
		System.out.println("String 1= "+str1);

		br.close();

		System.out.println("Enter string 2");
		String str2=br.readLine();
		System.out.println("String 2= "+str2);
	}


}
