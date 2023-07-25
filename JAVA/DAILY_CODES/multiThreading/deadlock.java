class MyThread extends Thread{
	
	static Thread nmMain=null;
	public void run(){
		try{
			nmMain.join();
			//nmMain.join(4000);
		}catch(InterruptedException ie){}

		for(int i=1;i<100;i++){
			System.out.print(i+" ");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread());

		MyThread.nmMain=Thread.currentThread();
		//passing thread main to nmMain variable for join
		//generally join() this method is not used bcz of DeadLock senerio
		//join(200) this method preferred

		MyThread obj=new MyThread();
		obj.start();

		obj.join();
	
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}
	}
}
