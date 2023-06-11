//Constructor chaining
/*
 * 1.Calling to global instance variables and
 * 2.Constructor chaining(calling another constructor from inside one contructor without creating another object of class is chaining)
 * these two are imp functions of this hidden reference
*/
class Demo{
	Demo(){
		System.out.println("In No args");
	}
	Demo(int x){
		this();       //calls to Demo();
			      //this() should be first line in Constructor
		System.out.println("In para");
	}

	public static void main(String[] args){
		Demo obj=new Demo(50);
	}
/*
 *In no args
 *In para
*/

}
