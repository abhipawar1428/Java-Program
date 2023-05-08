class Mylength{
	static int mylength(String str){
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		String str="Abhishek Pawar";
		int len=mylength(str);
		System.out.println("Length is: "+len);
	}
}
