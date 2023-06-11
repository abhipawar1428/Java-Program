class Demo{
	int x=10;

	Demo(){
		System.out.println("In constructor 1");
	}
	Demo(){
		System.out.println("In constructor 2");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
	}
}
//error=alreay defined demo() in class demo
