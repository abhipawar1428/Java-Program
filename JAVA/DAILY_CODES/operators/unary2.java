class unary{
	public static void main(String[] args){
		int x=10,y=20;

		int ans=++x + y++ + x++;

		System.out.println(ans);  //42
		System.out.println(x);   //12
		System.out.println(y);    //21
	}
}
