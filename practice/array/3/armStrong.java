//find armstrong numbers in array
//count number of digits in number suppose x...
//sum of each digit rest to x is equal to original number then it's armstrong number
import java.io.*;
class armstrong{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Armstrong numbers found at: ");
		for(int i=0;i<arr.length;i++){
			int count =0,temp=arr[i];
			while(temp!=0){
				count++;
				temp=temp/10;
			}
			temp=arr[i];
			int sum=0;
			while(temp!=0){
				int rem=temp%10;
				int power=1;
				for(int j=1;j<=count;j++){
					power=power*rem;
				
				}
				sum=sum+power;	
				temp=temp/10;
			}
			if(sum==arr[i]){
				System.out.println(i);
			}
		}
	}
}
