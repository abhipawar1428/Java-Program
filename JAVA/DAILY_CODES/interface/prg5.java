//static methods are not inherited to all child class (opposite to default method-they are available to all child classes)
//if any class requires static method then they are called through interface name

interface Demo1{
	static void fun(){
		System.out.println("In fun-Demo1");
	}
}
interface Demo2{
	static void fun(){
		System.out.println("In fun-Demo2");
	}
}
class ChildDemo implements Demo1,Demo2{
	//above two static methods are in available in this call bcz they are not inherited
	//static methods in interface does not inherits  in child class 
	void fun(){      //this fun() method is totally seperate...THis is not overrided method
		System.out.println("In fun-ChildDemo");
		Demo1.fun();
		Demo2.fun();
	}
}
class Client{
	public static void main(String[] args){
		Demo1 obj=new ChildDemo();
//		obj.fun();       //error-Demo1 does not have fun() that are in childDemo
//		                 //if this method is in class instead of interface then fun() in ChildDemo is overrided
//		                 //and error does not comes
		
		ChildDemo obj1=new ChildDemo();            
		obj1.fun();     
	}
}
