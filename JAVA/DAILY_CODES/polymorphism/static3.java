class Parent{
	static void fun(){
		System.out.println("In fun-parent");
	}

}
class Child extends Parent{
	static void fun(){
		System.out.println("In fun -Child");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Parent();
		obj.fun();            //in fun -parent

		Parent obj1=new Child();
		obj1.fun();           //in fun -parent

		Child obj2=new Child();
		obj2.fun();           //In fun-child


	}
}
//this concept is not about overriding 
//it is about method hiding
//In this, method will be called of class which is used as reference at time of object creation
//jya class cha reference tya class chi method call hote
