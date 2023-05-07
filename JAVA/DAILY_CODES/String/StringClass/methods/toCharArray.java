class Demo{
	public static void main(String[] args){
		String str1="Abhi Pawar";

	//	System.out.println(str1[1]);    error-array required but string found
	//
	
		char arr[]=str1.toCharArray();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}


	}
}
