import java.io.*;

class IODemo{
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter String");
		String str1=br.readLine();
		System.out.println("String 1= "+str1);
		//br.close();

		System.out.println("Enter char");
		char ch = (char)br.read();
		System.out.println("Char= "+ch);
	}
}
