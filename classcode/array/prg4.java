//accesing elements from array
//enter 10 digits and print them
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 elements");
		int arr[]=new int[10];

		for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(br.readLine());
		
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
