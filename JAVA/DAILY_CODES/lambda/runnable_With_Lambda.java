import java.io.*;
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{
		Runnable r1=() ->{
			System.out.println(Thread.currentThread().getName());
		};
		Runnable r2=() ->{
			System.out.println(Thread.currentThread().getName());
		};

		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);

		t1.start();
		t1.sleep(1000);

		t2.start();
	}
}
