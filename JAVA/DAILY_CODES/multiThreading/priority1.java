class MyThread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println("Thread-0:"+t.getPriority());

		t.setPriority(2);
		System.out.println("Thread-0: "+t.getPriority());
	}

}
class ThreadDemo{
	public static void main(String[] args){
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		MyThread obj=new MyThread();
		obj.start();

		t.setPriority(7);
		System.out.println("main: "+t.getPriority());
	}

}
