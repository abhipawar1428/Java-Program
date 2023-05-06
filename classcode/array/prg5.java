//enter and print sum
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 elements");
		int arr[]=new int[10];

		int sum=0;
		for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(br.readLine());
		sum=sum+arr[i];
		
		}
		System.out.println("Sum= "+sum);
	}
}
