class Demo{
	int x=10;

	Demo(){
		System.out.println("In No args");
		System.out.println(x);          //10
	}
	Demo(int x){
			
		System.out.println("In Para");
		System.out.println(x);          //20
		System.out.println(this.x);     //10
	}
	public static void main(String[] args){
		Demo obj=new Demo();           //Demo(obj)
		Demo obj1=new Demo(20);        //Demo(obj1,20)
	}
}
/*
 * in no args
 * 10
 * in para
 * 20
 * 10
 * */

//this reference is hidden as first parameter and it is act like address of object
//hence obj.x(this.x) gives us instance variable stored in object that is x

