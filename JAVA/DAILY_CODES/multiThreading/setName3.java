class MyThread extends Thread{
	MyThread(String str){
		super(str);
	}
	MyThread(){
		super();
	}
	public void run(){
		System.out.println(getName());
	}
}

class ThreadDemo{
	public static void main(String[] args){
		MyThread obj1=new MyThread("Abhi");
		MyThread obj2=new MyThread("Amruta");

		MyThread obj3=new MyThread();
		MyThread obj4=new MyThread();
		//create non parameterized contructor for above object
		//bcz if we create parameterized constructor then default constrctor not exists
		obj1.start();
		obj2.start();

		obj3.start();
		obj4.start();
	}
}
