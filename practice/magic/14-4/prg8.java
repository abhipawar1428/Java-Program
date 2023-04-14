//$
//@ @
//# # # 
//& & & &
//$ $ $ $ $
//@ @ @ @ @ @ 
//# # # # # # # 
//& & & & & & & &
//
import java.io.*;
class pattern{
	public static void main(String[] args)throws IOException{
		int count=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row");

		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(count==1)	{
					System.out.print("$ ");
				}
				else if(count==2)	{
					System.out.print("@ ");
				}
				else if(count==3)	{
					System.out.print("& ");
				}
				else	{
					System.out.print("# ");
				}
	
			}
			count++;
			if(count==5)
				count=1;
			System.out.println();
		}
	}
}
