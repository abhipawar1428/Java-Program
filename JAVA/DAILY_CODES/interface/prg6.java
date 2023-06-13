interface Demo1{
	void fun();
	default void gun(){
		System.out.println("In gun- Demo1");
	}
	default void run(){
		System.out.println("In run -Demo1");
	}
}
class ChildDemo implements Demo1{
	public void fun(){
		System.out.println("In fun-ChildDemo");
	}
	//ChildDemo contains fun(), gun() and run() methods 
	//default method is availabe in ChildDemo.Default methods are inherited in child class
	public void run(){
		System.out.println("In run-ChildDemo");
	}
	//this run is overrided in ChildDemo
}
class Client{
	public static void main(String[] args){
		Demo1 obj=new ChildDemo();
		obj.fun();
		obj.gun();
		obj.run();
	}
}

