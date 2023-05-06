class methodDemo{
/*	void mun(){
		System.out.println("In mun");
	}                                               error-non static method cannot be referenced(called) from static method(main)
*/	static void nun(){
		System.out.println("In nun");
	}
	public static void main(String[] args){
		System.out.println("In main");
		fun();
		gun();
//		mun();
		nun();
	}
	static void fun(){
		System.out.println("In Fun");
	}
	static void gun(){
		System.out.println("In gun");
	}
}
