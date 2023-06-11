/*
1.Static blocks: Static blocks are executed only once, when the class is loaded into memory. They are executed in the order they appear in the code.
2.Static methods: Static methods can be called without creating an instance of the class. They are executed in the order they are called.
3.Instance blocks: Instance blocks are executed whenever a new instance of the class is created, before the constructor. If there are multiple instance blocks, they are executed in the order they appear in the code.
4.Constructors: Constructors are used to initialize objects. They are executed after the instance blocks and before any other methods in the class.
*/
class Demo{
	int x=10;
	static int y=20;

	Demo(){
		System.out.println("In Constructor");
	}
	{
		System.out.println("In instance block 1");
	}
	static{
		System.out.println("In static block 1");
	}
	static void staticmethod(){
		System.out.println("In static method");
	}
	public	static void main(String[] args){
		System.out.println("In main");
		Demo.staticmethod();
		Demo obj=new Demo();
		Demo.staticmethod();
		System.out.println("In main");
		Demo obj2=new Demo();
	
	}
	{
		System.out.println("In instance block 2");
	}
	static {
		System.out.println("In Static block 2");
	}
}
/*In static block 1
In Static block 2
In main
In static method
In instance block 1
In instance block 2
In Constructor
In static method
In main
In instance block 1
In instance block 2
In Constructor
*/


/*
The execution sequence in Java between static variables, instance methods, constructor, static methods, static blocks, instance variables, and instance blocks can be summarized as follows:

1. Static variables: Static variables are initialized when the class is loaded into memory and before any other static or instance member is accessed.

2. Static methods: Static methods can be called without creating an instance of the class. They can access static variables and are executed in the order they are called.

3. Static blocks: Static blocks are executed only once, when the class is loaded into memory. They are executed in the order they appear in the code.

4. Instance variables: Instance variables are created when an instance of the class is created and assigned default values (0, null, or false). They are initialized before the instance block or constructor is executed.

5. Instance blocks: Instance blocks are executed whenever a new instance of the class is created, before the constructor. If there are multiple instance blocks, they are executed in the order they appear in the code.

6. Constructors: Constructors are used to initialize objects. They are executed after the instance blocks and before any other methods in the class. They can access instance variables.

7. Instance methods: Instance methods can be called on an instance of the class. They can access both static and instance variables and are executed when called.

*/
