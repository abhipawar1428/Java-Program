import java.io.*;

class flatInfo{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Building Name");
		String buildName= br.readLine();

	
		System.out.println("Enter wing ");
		char wing=(char)br.read();
		br.skip(1);
		//br.close();    used to cut connection between keyboard and jvm

		System.out.println("Enter flat no");
		int flatNo=Integer.parseInt(br.readLine());

		System.out.println("Building Name= "+buildName);
		System.out.println("wing= "+wing);
		System.out.println("flat no= "+flatNo);
		

	}
}
