//merge two array
import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array 1");
		int size=Integer.parseInt(br.readLine());
		System.out.println("Enter size of array 2");
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

		int mergearr[]=new int[arr1.length+arr2.length];
		for(int i=0;i<mergearr.length;i++){
			if(i<arr1.length){
				mergearr[i]=arr1[i];
			}else{
				mergearr[i]=arr2[i-arr1.length];
			}
		}
		System.out.println("Merged array is: ");
		for(int x:mergearr){
			System.out.println(x +" ");
		}




	}
}
