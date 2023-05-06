
//print count of digits in each element of array
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("count of digits in each elements are: ");
		for(int i=0;i<arr.length;i++){
			int count=0;
			int temp=arr[i];
			while(temp!=0){
				count++;
				temp=temp/10;
			}
			System.out.print(count+" ");
	
		}


	}
}
