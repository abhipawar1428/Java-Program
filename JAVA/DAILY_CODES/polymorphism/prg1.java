/*
 * Polymorphism is mainly classified in two types
 * 1=compile time/method overloading/early binding polymorphism
 * 2=runtime/method overriding/late binding polymorphism
 *
 * method overloading is act on same class 
 * and method overriding is act on different classes
 *
 * overloading means functions with same name but diff parameters
 * In Overriding Inheritance is required.Parent class method is overrided in child class
 *
 * println is example of method overloading
 * equals method in object class and equals method in String class is example of mehtod overriding
 * equals method in object class checks address of string and equals method in String class checks content of String
 *
 * real time example of overloading is  -> woman with different roles it can wife,mother,daugther at same time
 * real time example of overriding is -> If parent declared marry method with only girl but child is not agree is parent decision then he can deny that girl and get marry with it's fav girl
 *
 * return type is not considered in method overloading but it is considered in method overriding
 *
 */
class PolyDemo{
	int add(int x,int y){
		return x+y;
	}
	float add(int x,float y){
		return x+y;
	}
	float add(float x,float y){
		return x+y;
	}
	public static void main(String[] args){
		PolyDemo obj=new PolyDemo();
		System.out.println(obj.add(10,10));
		System.out.println(obj.add(10.5f,10.5f));
		System.out.println(obj.add(10,1.5f));
	}
}
