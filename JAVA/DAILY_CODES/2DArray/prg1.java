import java.io.*;
class ArrayDemo{
	public static  void main(String[] args)throws IOException{
		int arr[][]=new int[][]{{11,12},{5,5,6},{5,5,6}};
		int arr2[][]={{1,2},{5,6},{51,6}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
