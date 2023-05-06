
//enter numbers and print product of odd index numbers
import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("enter elements");
		int product=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2==1){
				product=product*arr[i];
			}
		}
		if (size==0)
			product=0;
		System.out.println("product of odd index numbers is "+product);
	}
}
