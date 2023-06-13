//if two same methods from two diff interface with default are inherited in third class then that method method should be overrided
//otherwise compiler get confused (Ambiguity) and error comes
interface Demo1{
	default void fun(){                   //access specifier is public 
		System.out.println("In fun-Demo1");	
	}            
}
interface Demo2{
	default void fun(){
		System.out.println("In fun-Demo2");	
	}
}
class Child implements Demo1,Demo2{
	public void fun(){
		System.out.println("In fun-Child");
	}	
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		Demo1 obj2=new Child();
		Demo2 obj3=new Child();

		obj.fun();
		obj2.fun();
		obj3.fun();

//		Demo1 obj4=new Demo1();        //cannot create object of interface


	}
}
