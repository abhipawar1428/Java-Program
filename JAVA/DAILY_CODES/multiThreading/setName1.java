class MyThread extends Thread{
	public void run(){
		System.out.println(getName());

	}
}
class ThreadDemo{
   public static void main(String[] args)throws InterruptedException{
	MyThread obj=new MyThread();
	obj.start();

	Thread.sleep(100);
	obj.setName("C2W");
	//set name thread at time of creation of thread
	//it's not recommended to set name after creating thread
   }


}
