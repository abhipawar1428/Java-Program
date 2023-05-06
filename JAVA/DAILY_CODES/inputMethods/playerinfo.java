import java.io.*;

class PlayerInfo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player name");
		String name= br.readLine();
		
		System.out.println("Enter jersyNo");
		int jersy= Integer.parseInt(br.readLine());

		System.out.println("Enter Avg");
		float avg=Float.parseFloat(br.readLine());

		System.out.println("Name= "+name);
		System.out.println("JersyNo= "+jersy);
		System.out.println("Avg= "+avg);

	}
}
