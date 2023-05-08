class Demo{
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer("Abhishek");
		System.out.println(str1.capacity());  //24

		System.out.println(System.identityHashCode(str1));

		str1.append("Pawar");
	//	str1=str1.concat("fghjk");   //error bcz it's string's method
		System.out.println(str1.capacity());  //24
		
		//System.out.println(System.identityHashCode(str1));
		str1.append("AbhiSPawar");
		System.out.println(str1.capacity());  //24
		System.out.println(str1);    //AbhishekPawarAbhiSPawar

		str1.append("X");
		System.out.println(str1.capacity());  //24

		str1.append("Y");                     //total stored char are 25
		System.out.println(str1.capacity());  //50
		System.out.println(System.identityHashCode(str1));

		str1.append("1234567891234567891234567891234567891234567891234567891234567891234567891234");
		System.out.println(str1.capacity());   //102
		System.out.println(System.identityHashCode(str1));

		//identity hash code will be remain same that 
		//means there is no new object creation only capacity will be increases with 2*previous_capacity+2






	}
}
