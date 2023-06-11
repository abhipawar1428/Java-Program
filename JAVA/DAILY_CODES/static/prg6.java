//static variables are not allowed to write inside any method/function or block

//static variables->static block->main method->static methods->instance variables->instance block->constructor->instance methods

//static variables are stored in static block and static block is inside special structure

class Demo{
	static{
		System.out.println("Inside in static block 1");
	}	
	public static void main(String[] args){
		System.out.println("In Demo main");
	}
}
class Client{
	static{
		System.out.println("Inside in static block 2");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println("In Client main");
	}
	static{
		System.out.println("Inside in static block 3");
	}
}
//if=>  java Client
//static block 2
//static block 3
//static block 1
//in client main
//
//if=>  java Demo
//static block 1
//in demo main
