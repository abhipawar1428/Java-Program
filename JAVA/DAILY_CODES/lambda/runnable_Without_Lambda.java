class ThreadDemo{
	public static void main(String[] args){
		Runnable obj=new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};	
		Runnable obj2=new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);

		t1.start();
		t2.start();
	}
}
