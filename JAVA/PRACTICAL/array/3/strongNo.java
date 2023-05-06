//find strong numbers in arary
//strong number means if addition of factorial of each digit is equal to original numbers then it is strong number
import java.io.*;
class strong{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Elements of array");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Strong numbers found at: ");
		for(int i=0;i<arr.length;i++){
			int fact=1;int sum=0;
			int temp=arr[i];
			while(temp!=0){
				int rem=temp%10;
				temp=temp/10;
				for(int j=1;j<=rem;j++){
					fact=fact*j;
				}
				sum=sum+fact;
				fact=1;
			}
			
		
			if(sum==arr[i]){
				System.out.print(i+" ");
			}
		}
	
	}
}
