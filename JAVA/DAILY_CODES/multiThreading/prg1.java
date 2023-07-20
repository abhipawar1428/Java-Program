class Demo{
	public static void main(String[] args)throws InterruptedException{
		for(int i=0;i<10;i++){
			System.out.println(i +" ");
			Thread.sleep(3000);     //throws interruptedException so declared at time of main method declaration 
		}
	}
}
