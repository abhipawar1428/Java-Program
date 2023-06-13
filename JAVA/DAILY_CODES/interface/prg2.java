interface Demo{
	void fun();
	void gun();
}
abstract class ChildDemo1 implements Demo{
	public void fun(){
		System.out.println("In fun");
	}
	//if we didnot gives body to all functions then this class also contains abstract methods 
	//and if any class contains abstract methods then that class should be abstract
	//hence we declare this class as abstract
}
class ChildDemo2 extends ChildDemo1{
	public void gun(){
		System.out.println("In gun");
	}
}
class Client{
	public static void main(String[] args){
	//	Demo obj=new ChildDemo1();         //we can not create object of ChildDemo1 bcz it is abstract class
		Demo obj=new ChildDemo2();
		ChildDemo1 obj2=new ChildDemo2();
		ChildDemo2 obj3=new ChildDemo2();
		//above 3 are possible ways to create object

		obj.fun();
		obj2.fun();
		obj3.fun();

		obj.gun();
		obj2.gun();
		obj3.gun();
	}
}
