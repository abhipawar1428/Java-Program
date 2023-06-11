class Demo{
	int x=10;

	Demo(){
		System.out.println("In No args Con");
	}
	Demo(int x){
		System.out.println("In Para Con");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		Demo obj2=new Demo(10);
	}
}
/*
 *here x will be initialized in both constructor Demo() and Demo(int)
 *Demo() and Demo(int ) this two are seperate signatures in signature table
 * */
