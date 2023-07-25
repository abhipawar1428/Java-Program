class MyThread extends Thread{
	public void run(){
		System.out.println(getThreadGroup());
	
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();

		System.out.println(obj.getThreadGroup());
	}
}
