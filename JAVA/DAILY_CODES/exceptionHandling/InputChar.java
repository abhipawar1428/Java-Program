import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ch=(char)br.read();
		
	       //br.close();	
		
	       BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		br.close();
       	       char ch2=(char)br2.read();
		br2.skip(1);
		System.out.println(ch2);
	}
}
