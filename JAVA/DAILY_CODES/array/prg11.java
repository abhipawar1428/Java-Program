
//enter n charaters and print only vowels
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());

		char carr[]=new char[size];
		System.out.println("enter charcters");
		for(int i=0;i<carr.length;i++){
			carr[i]=(char)br.read();
			br.skip(1);
		}
		System.out.println("Vowels are: ");
		for(int i=0;i<carr.length;i++){
			if(carr[i]=='a' || carr[i]=='A' ||
			   carr[i]=='e' || carr[i]=='E' ||
			   carr[i]=='i' || carr[i]=='I' ||
	       		   carr[i]=='o' || carr[i]=='O' || 
			   carr[i]=='u' || carr[i]=='U'){
				System.out.println(carr[i]+" ");
			}
		}
	}
}

