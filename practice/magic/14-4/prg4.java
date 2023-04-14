//enter range
//print even numbers in reverse order and odd numbers in standard way
import java.io.*;
class range{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Start and end ");
		int start= Integer.parseInt(br.readLine());
		int end= Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=end;i>=start;i--){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}
