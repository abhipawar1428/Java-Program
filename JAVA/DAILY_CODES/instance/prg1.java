//instance variables->instance block->constructor->instance methods
class Demo{
	int x=10;
	Demo(){
		System.out.println("Constructor");
	}
	{
		//instance block
		System.out.println("In instance block 1");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println("In main");
	}
	{
		System.out.println("In instance block 2");
	}
}
//in instance block 1
//in instance block 2
//constructor
//in main
