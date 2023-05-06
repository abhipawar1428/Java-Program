//0
//1 1
//2 3 5
//8 13 27 40
import java.io.*;
class pattern{
	public static void main(String[] args)throws IOException{
		int a=0,b=1,c=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row");

		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	
	}
}
	
