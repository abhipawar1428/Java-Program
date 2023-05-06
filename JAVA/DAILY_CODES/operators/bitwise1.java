class bitwise{
	public static void main(String[] args){
		int x=5,y=7;

		System.out.println(x|y);  //5->  0101
					  //7->  0111
					  //ans->0111->7
		System.out.println(x&y);  //5->  0101
					  //7->  0111
					  //ans->0101->5
		System.out.println(x^y);  //5->  0101
					  //7->  0111
					  //ans->0010->2  same binary will give 0
		System.out.println(x>>2); //5->  0101->01->1
		System.out.println(x<<2); //5->  0101->010100->20

		
	}

}
