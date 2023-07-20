import java.io.*;
class NumForExcDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int data=0;

		try{
			data=Integer.parseInt(br.readLine());
		}catch(NumberFormatException nfe){
			System.out.println("ENter int data");
			data=Integer.parseInt(br.readLine());
		}
		System.out.println("Num: "+data);
	}
}
