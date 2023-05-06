//enter numbers and print odd and even count
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 elements");
		int arr[]=new int[10];
		int ecnt=0,ocnt=0;

		for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(br.readLine());
		if(arr[i]%2==0){
			ecnt++;
		}else{
			ocnt++;
		}
		
		}
		System.out.println("Even Count= "+ecnt);
		System.out.println("Odd count= "+ocnt);
	}
}
