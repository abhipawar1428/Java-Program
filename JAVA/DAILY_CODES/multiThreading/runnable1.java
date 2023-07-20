class MyThread implements Runnable{
	public void run(){
		System.out.println("In run");
		System.out.println("MyThread: "+Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		t.start();

		System.out.println("ThreadDemo: "+Thread.currentThread().getName());
	}
}
