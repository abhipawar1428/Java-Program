class Demo{
	void fun(Object obj){
		System.out.println("Object");
	}
	void fun(String str){
		System.out.println("String");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();

		obj.fun("Abhi");
		obj.fun(new StringBuffer("Abhishek"));       //Object class is parent of StringBuffer class so it allows StringBuffer as parameter
		obj.fun(null);
	}
}
