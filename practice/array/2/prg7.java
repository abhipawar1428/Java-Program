//find common element between two arrays
import java.io.*;

class commonDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter size of array 1 ");
		int size =Integer.parseInt(br.readLine());
		int arr1[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter size of array 2 ");
		size =Integer.parseInt(br.readLine());
		int arr2[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
System.out.println("Common elements are :");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}
