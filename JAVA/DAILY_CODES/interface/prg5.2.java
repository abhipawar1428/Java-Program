/*

class Demo{
	static void fun(){
		System.out.println("In fun demo");
	}
}
class Child extends Demo{

}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.fun();        //In fun demo
	}
}

*/

/*
 *in class static methods are inherited and avilable in child class 
 but in interface static methods are not avaiable in child class(static methods are not inherited in child class)
*/
interface Demo{
	static void fun(){
		System.out.println("In fun demo");
	}
}
class Child implements Demo{

}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.fun();        //cannot find syambol
	}
}
