class Demo{
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer("Abhishek");
		System.out.println(str1.capacity());  //24

		System.out.println(System.identityHashCode(str1));

		str1.append("Pawar");
//error		str1=str1.concat("fghjk");
		System.out.println(str1.capacity());  //24
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);    //AbhishekPawar


	}
}
