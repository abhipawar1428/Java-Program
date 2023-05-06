//wap to print index of composite numbers from array
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Composite numbers are:");
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
				if(count>2){
					break;
				}
			}
			if(count>2){
				System.out.println(arr[i]+" ");
			}
			count=0;
		}
	}
}
