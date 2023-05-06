//print only those element whose sum of digits is even
//
import java.io.*;
class demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Answer is");
		for(int x:arr){
			int sum=0;
			int temp=x;
			while(x!=0){
				int rem=x%10;
				sum=sum+rem;
				x=x/10;
			}
			if(sum%2==0){
				System.out.print(temp+" ");
			}
		}
	}
}
