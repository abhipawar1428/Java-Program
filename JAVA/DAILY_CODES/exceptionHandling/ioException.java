import java.io.*;
class Demo{
	public static void main(String[] args) //throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str=br.readLine();   //error : throws IOException if we didn't declared it after main declaration or didn't use try catch

	}
}
