class MyThread extends Thread{
	//parameterized constructor for set name
	
	MyThread(String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());   //C2W
		System.out.println(Thread.currentThread().getName());   //C2W
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread obj=new MyThread("C2W");
		obj.start();
		
		System.out.println(Thread.currentThread().getName());   //main
		System.out.println(obj.getName());   //C2W    getname() is present in MyThread
//		System.out.println(getName());   //error getName() is not present in ThreadDemo class 

	}
}
