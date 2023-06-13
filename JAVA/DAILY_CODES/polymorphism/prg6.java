class Demo{
	void fun(int x,float y){
		System.out.println("In int-float");
	}
	void fun(float x,int y){
		System.out.println("In float-int");
	}
	
}
class Client{

	public static void main(String[] args){
		Demo obj=new Demo();

		obj.fun(10,10);          //error-function is ambiguious
	}
}
