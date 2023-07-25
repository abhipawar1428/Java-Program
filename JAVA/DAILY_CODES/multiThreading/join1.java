class MyThread extends Thread{
	public void run(){
		for(int i=1;i<100;i++){
			System.out.print(i+" ");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread());

		MyThread obj=new MyThread();
	
		obj.start();

		obj.join();
	//	obj.join(10);       //time as parameter

		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}
	}
}
