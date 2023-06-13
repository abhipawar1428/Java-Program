interface Demo1{
	void gun();
	void fun();
}
interface Demo2{
	void fun();
	void run();
}
class DemoChild implements Demo1,Demo2{
	public void gun(){
		System.out.println("In gun");
	
	}
	public void fun(){
		System.out.println("In fun");
	
	}
	public void run(){
		System.out.println("In run");
	}
}
class Client{
	public static void main(String[] args){
	DemoChild obj1=new DemoChild();
	obj1.fun();
	obj1.gun();
	obj1.run();

	Demo1 obj2=new DemoChild();
	obj2.fun();
	obj2.gun();
//	obj2.run();     //error    ->demo1 cannot cantain run() method
	
	Demo2 obj3=new DemoChild();
	obj3.fun();
//	obj3.gun();     //error
	obj3.run();
}
}
