//D4 C3 B2 A1
//A1 B2 C3 D4
//D4 C3 B2 A1
//A1 B2 C3 D4
import java.io.*;
class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter row count");
		int row=Integer.parseInt(br.readLine());

		char ch='A';
		ch+=(row-1);
		int num=row;
		for(int i=1;i<=row;i++){
			num=row;
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j==1){
						ch='A';
						ch+=row-1;
					}
					System.out.print(ch+""+num+" ");
					num--;
					ch--;
				}else{
					if(j==1){
						ch='A';
					}
					System.out.print(ch+""+j+" ");
					ch++;
				}

			}
			System.out.println();
		}
	}
}
