class Demo{
	Demo(){
		this(50);
	}
	Demo(int x){
		this();
	}
	public static void main(String[] args){
		Demo obj=new Demo();
	}
//error= recursive constructor invocation
}
