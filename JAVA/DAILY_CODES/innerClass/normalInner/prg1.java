class Outer{
	class Inner{
		void fun2(){
			System.out.println("In Inner fun2");
		}
	}
	void fun1(){
		System.out.println("In Outer fun1");
	}
}

class Client{
	public static void main(String[] args){
		//method 1
		Outer.Inner obj=new Outer().new Inner();
		obj.fun2();
		obj.fun1();   //error
		new Outer().fun1();

		//method 2
		Outer obj2=new Outer();
		Outer.Inner obj3=obj2.new Inner();
		obj2.fun1();
		obj3.fun2();
	}
}
