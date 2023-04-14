import java.io.*;

class BufferDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Batsman Name ");
		String batter= br.readLine();

		System.out.println("Enter Bowler name");
		String bowler= br.readLine();

		System.out.println("Batter= "+batter);
		System.out.println("Bowler= "+bowler);
	}
}
