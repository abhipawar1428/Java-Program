class Outer{
	class Inner{
		void fun1(){
			System.out.println("In Inner fun1");
		}
	}
	void fun2(){
		System.out.println("In Outer Fun2");
	}
	public static void main(String[] args){
		Inner obj1=new Outer().new Inner();
		obj1.fun1();
	
	}
}
class Client{
		public static void main(String[] args){
		Outer.Inner obj=new Outer().new Inner();
		new Outer().fun2();
		obj.fun1();


	}
}
