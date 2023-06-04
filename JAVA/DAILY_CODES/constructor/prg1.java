class Demo{
	static void Demo(){
		System.out.println("In Method");
	}
	Demo(){
		System.out.println("In Demo Contructor");
	}
	public static void main(String[] args){
		Demo obj=new Demo();    //inplicit call to contructor
		Demo();                 // call  to Demo function
	}
}
