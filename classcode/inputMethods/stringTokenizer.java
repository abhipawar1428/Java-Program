import java.io.*;
import java.util.*;

class IODemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter match info,man of match and runs scored");
		String info=br.readLine();

		StringTokenizer obj=new StringTokenizer(info,",");

		String token1=obj.nextToken();
		String token2=obj.nextToken();
		int token3=Integer.parseInt(obj.nextToken());

		System.out.println("Match info= "+token1);
		System.out.println("Man of Match= "+token2);
		System.out.println("Runs Scored= "+token3);
	}
}
