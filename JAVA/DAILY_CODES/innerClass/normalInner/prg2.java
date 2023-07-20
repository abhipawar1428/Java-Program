class Outer{
	class Inner{
		void fun1(){
			System.out.println("In Inner Fun1");
		}
	}
	void fun2(){
		System.out.println("In Outer fun2");
	}
	public static void main(String[] args){
		Inner obj=new Outer().new Inner();
		obj.fun1();

		//for calling fun2
		new Outer().fun2();
	}
}
