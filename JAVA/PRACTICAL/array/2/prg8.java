//find uncommon elements bteween two arrays
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of array 1 and array 2");
		int size=Integer.parseInt(br.readLine());
		int size2=Integer.parseInt(br.readLine());

		int arr1[]=new int[size];
		int arr2[]=new int[size2];

		System.out.println("Enter elements of array 1");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter elements of array 2");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}

		int flag=1;
		System.out.println("Uncommon elements are :");
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.println(arr1[i]);
			}
			flag=1;
		}
		
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr2[i]==arr1[j]){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.println(arr2[i]);
			}
			flag=1;
		}
		
		

	}
}
