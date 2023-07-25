class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		
		ThreadGroup pthreadGP=new ThreadGroup("C2W");   //giving thread group name
		MyThread obj=new MyThread(pthreadGP,"C");      //ThreadGroup object and thread name
		MyThread obj1=new MyThread(pthreadGP,"Java");
		MyThread obj2=new MyThread(pthreadGP,"Python");

		obj.start();
		obj1.start();
		obj2.start();

		ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"Incubator");  //parent thread group and name of thread group
		//here pthreadGP is Preant Thread Group of cthreadGP
		MyThread obj4=new MyThread(cthreadGP,"React");       
		MyThread obj5=new MyThread(cthreadGP,"Flutter");
		MyThread obj6=new MyThread(cthreadGP,"SpringBoot");

		obj4.start();
		obj5.start();
		obj6.start();
		//here total 7 threads including main thread



	}
}
