class Demo{
	void fun(String str){
		System.out.println(str);
	}
	void fun(StringBuffer str){
		System.out.println(str);
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("Abhi");
		obj.fun(new StringBuffer("Abhishek"));
//		obj.fun(null);       //error-Ambiguity due to String and StringBuffer both allowed this parameter
	}
}
