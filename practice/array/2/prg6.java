//find max int
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		int max=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Max element is "+max);
	}
}
