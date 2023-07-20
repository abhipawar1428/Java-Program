import java.io.*;
class Demo{
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str=null;
		try{
			str=br.readLine();

		}catch(IOException obj){

			System.out.println(obj);

		}
		System.out.println(str);

	}
}
