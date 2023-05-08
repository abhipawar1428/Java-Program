class myToCharArray{
	static void myToCharArray(String str,char[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=str.charAt(i);
		}
	}
	public static void main(String[] args){
		String str="Abhishek";
		char arr[]=new char[str.length()];
		myToCharArray(str,arr);
		for(char ch:arr){
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}
