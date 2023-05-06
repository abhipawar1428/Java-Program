//find prime elements from array and return index
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Prime numbers are at: ");
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
				if(count>2){
					break;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		}
	}
}
