class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("In Run");
		}
	}	
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();

		obj.yield();

	
		for(int i=1;i<=10;i++){
			System.out.println("In main");
		}
	}
}
