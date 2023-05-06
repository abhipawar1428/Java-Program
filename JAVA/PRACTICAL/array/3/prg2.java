//reverse each element of array and print it
//
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

			int rev=0;
			while(arr[i]!=0){
				int rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]=arr[i]/10;
			}
			arr[i]=rev;
		}
		System.out.println("Reverse elements are: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}


	}
}
