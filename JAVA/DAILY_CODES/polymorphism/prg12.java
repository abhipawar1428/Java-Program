class Parent{
	private void fun(){
		System.out.println("In fun parent");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("In fun child");
	}
}
class Client{
	public static void main(String [] srgs){
		Parent obj=new Child();
//		obj.fun();    error-void fun is private
//
		//hare,there is not overriding concept bcz void fun() in Parent is not inherited into Child bcz it is private
		//private methods does not comes into child class
	}
}
