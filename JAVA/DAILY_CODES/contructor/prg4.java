class Demo{
	int x=10;
	Demo(){
		System.out.println("In Demo");
	}
	int y=20;

	public static void main(String[] args){
		System.out.println("In Main");
		Demo obj=new Demo();   //implicit call to Demo Contructor
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	
	}
	int z=30;
}
//In main
//In Demo
//10
//20
//30
