interface Core2Web{
	void lang();
}
class Year2002{
	public static void main(String[] args){
	/*	Core2Web c2w=()->{
			System.out.println("C/Cpp/DSA/Java/OS");
		};
		c2w.lang();
	*/

		//above expression is lambda expression
		//we use this expression instead of below expression 
		//It helps to less code and not creates extra class
		//
		//
		Core2Web c2w=new Core2Web(){
			public void lang(){
				System.out.println("C/Cpp/DSA/Java/OS");
				
			}
		};
		c2w.lang();
	}
}
