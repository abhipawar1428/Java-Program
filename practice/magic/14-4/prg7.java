//O
//14 13
//L K J
//9 8 7 6
//E D C  B A
//
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row");
		int row=Integer.parseInt(br.readLine());

		int num=(row*(row+1))/2;

		char ch='A';
		ch+=(num-1);

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(ch+" ");
				}else{
				
					System.out.print(num+" ");
				}
				num--;
				ch--;
			}
			System.out.println();
		}

	}
}
